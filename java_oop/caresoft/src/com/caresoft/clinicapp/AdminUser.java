package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    public AdminUser(int id, String role) {
    	super(id);
    	securityIncidents = new ArrayList<>();
    }
    
    // TO DO: Implement a constructor that takes an ID and a role
    
    public Integer getEmployeeID() {
    	return employeeID;
    }
    
    public void setEmployeeID(Integer employeeID) {
    	this.employeeID = employeeID;
    }
    
    public String getRole() {
    	return role;
    }
    
    public void setRole(String role) {
    	this.role = role;
    }
    
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public ArrayList<String> getSecurityIncidents() {
    	return securityIncidents;
    }
    
    public void getSecurityIncidents(ArrayList<String> securityIncidents) {
    	this.securityIncidents = securityIncidents;
    }
    
//    implementations are going to run all the code in their respective interfaces
//    both interfaces are being implemented here so all the methods will be run
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    // TO DO: Setters & Getters
    // these are the methods that will be implemented from the provided interfaces with conditions
    // these would be overrided without those conditions so the only method being implemented
    // is the QA test    
    
    @Override
    public ArrayList<String> reportSecurityIncidents() {
    	return securityIncidents;
    }
    @Override
    public boolean assignPin(int pin) {
    	if (pin>99999 && pin<1000000) {
    		return true;
    	}
    	return false;
    }
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if (this.id == confirmedAuthID) {
    		return true;
    	}
    	authIncident();
    	return false;
    }
}
