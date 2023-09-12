public class test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        boolean isRaining = true;
        boolean isCold = true;
    
        if(isRaining) {
            System.out.println("Bring an umbrella.");
        }
        else if(isCold) {
            System.out.println("Wear a coat.");
        }
        else {
            System.out.println("Have fun!");
        }
        int day = 3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There are only seven days in a week...");
        }
        String ninja = "Coding dojo is awesome!";
        int length = ninja.length();
        System.out.println("String length is " + length);
        String string1 = "My name is ";
        String string2 = "Michael";
        String string3 = string1.concat(string2);
        System.out.println(string3);
        String ninjas = String.format("Hi %s, you owe me $%f !", "Jack", 25.0);
        System.out.println(ninjas);
    }
}

