
public class Bat extends Mammal {
	public Bat() {
		super(300);
	}
	
	void fly() {
		System.out.println("The bat is airborne");
		energyLevel -= 50;
		displayEnergy();
	}
	
	void eatHumans() {
		System.out.println("The bat is happy after eating and gains energy");
		energyLevel += 25;
		displayEnergy();
	}
	
	void attackTown() {
		System.out.println("The bat is wrecking havoc and loses energy");
		energyLevel -= 100;
		displayEnergy();
	}
	
}
// super calls method from Parent class, which is Mammal
// Bat is child to Mammal class