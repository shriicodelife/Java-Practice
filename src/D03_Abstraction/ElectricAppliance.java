package D03_Abstraction;
 //1. Electric Appliance Interface
//Create an interface Appliance with methods like turnOn() and turnOff().
//Implement it in Fan and Refrigerator classes.
//Use interface references to call the methods.

interface Appliance {
    void turnOn();
    void turnOff();
}

class Fan implements Appliance{
    @Override
            public void turnOn() {
        System.out.println("Fan is now ON.");
    }
        @Override
        public void turnOff() {
            System.out.println("Fan is now OFF.");
        }
    }

class Refrigerator implements Appliance{
    @Override
    public void turnOn() {
        System.out.println("Refrigerator is now ON.");
    }
    @Override
    public void turnOff() {
        System.out.println("Refrigerator is now OFF.");
    }
}

public class ElectricAppliance {
    public static void main(String[] args) {

        Appliance Fan = new Fan();
        Appliance Refrigerator = new Refrigerator();

        Fan.turnOn();
        Fan.turnOff();
        Refrigerator.turnOff();
        Refrigerator.turnOn();


    }
}

