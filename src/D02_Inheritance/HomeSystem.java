package D02_Inheritance;
//. Smart Home System (Inheritance + Polymorphism)
//Create a base class Appliance with method turnOn() and turnOff().
//Extend it with Light, Fan, and AC classes that override the behavior differently.


import javax.net.ssl.HostnameVerifier;

class Appliance {
    public void turnOn() {
        System.out.print("Appliance is turnOn");
    }
      public void turnOff(){
    System.out.print("Appliance is turnOff");
}
}
class Light extends Appliance{
    @Override
    public void turnOn() {
        System.out.println("Light is glowing.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is off.");
    }
}
class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("🌀 Fan is spinning.");
    }

    @Override
    public void turnOff() {
        System.out.println("🌀 Fan is stopped.");
    }
}
class AC extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("❄️ AC is cooling the room.");
    }

    @Override
    public void turnOff() {
        System.out.println("❄️ AC is turned off.");
    }
}
public class HomeSystem {
    // Polymorphic method

    public static void controlAppliance(Appliance appliance) {
        appliance.turnOn();
        appliance.turnOff();
    }

public static void main(String[] args) {
    Appliance light = new Light();
    Appliance fan = new Fan();
    Appliance ac = new AC();

    controlAppliance(light);
    controlAppliance(fan);
    controlAppliance(ac);
}
        }


