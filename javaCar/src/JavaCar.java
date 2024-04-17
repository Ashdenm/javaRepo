public class JavaCar { 
    static JavaCar car = new JavaCar(); // new car instance
    static int distance = 0; // starting distance driven variable
    static int battery = 100; //starting battery variable
    public static void dD() { 
        System.out.println(" ");
        System.out.println("Driven " + distance + " meters"); // displays distance driven
    }
    public static void bD() {
        if (battery > 0) {
            System.out.println("Battery at " + battery + "%"); //displays battery percentage unless it's empty
        }
        else {            
            System.out.println("Out of battery!"); // if the battery's empty, print "Out of battery!"
            System.exit(battery); //get rid of battery and stops the car from driving more
        }
    }
    void batteryDisplay() {
        bD(); // can print the current battery percentage by calling on batteryDisplay
    }
    void distanceDisplay() {
        dD(); // can print the distance driven by calling on distanceDisplay
    }
    void drive() { // when car.drive() is called, increase distance driven by 20 and reduce battery by 1
            distance = distance + 20;
            battery--;
    }
    public static void main(String args[]) { 
        car.drive(); //drives twice then prints distance driven and current battery
        car.drive();
        car.distanceDisplay();
        car.batteryDisplay();
        /*
        while (distance < 1000000) {
            car.drive();
            car.distanceDisplay();
            car.batteryDisplay();
        } // if you uncomment this block it makes it loop until the battery's dead
        */
    }
} 