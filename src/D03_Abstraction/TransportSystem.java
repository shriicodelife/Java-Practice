package D03_Abstraction;
//6. Transport System
//Interface Transport with methods like start(), stop().
//Implement in Bus, Train, Airplane.
//Use interface-based polymorphism to simulate journey.

interface Transport {
    void start();
    void stop();
}
class Bus implements Transport {
    @Override
    public void start() {
        System.out.println("Bus is starting. Passengers boarding...");
    }

    @Override
    public void stop() {
        System.out.println("Bus has stopped. Passengers disembark.");
    }
}

class Train implements Transport {
    @Override
    public void start() {
        System.out.println("Train is starting. Whistle blows...");
    }

    @Override
    public void stop() {
        System.out.println("Train has stopped at the station.");
    }
}
class Airplane implements Transport {
    @Override
    public void start() {
        System.out.println("Airplane is taking off. Fasten your seatbelts...");
    }

    @Override
    public void stop() {
        System.out.println("Airplane has landed safely.");
    }
}
public class TransportSystem{
    public static void simulateJourney(Transport transport){
 transport.start();
        System.out.println("...Journey in progress...");
        transport.stop();
        System.out.println("---------------------------");
}
    public static void main (String[] args){
            Transport bus = new Bus();
            Transport train = new Train();
            Transport airplane = new Airplane();

            simulateJourney(bus);
            simulateJourney(train);
            simulateJourney(airplane);
        }
    }
