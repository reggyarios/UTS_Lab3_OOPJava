public class Car {
    private String make;
    private String model;
    private int year;
    private int odometerReading;
    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.odometerReading = 0;
    }
    
    public String getDescriptiveName() {
        String longName = year + " " + make + " " + model;
        return longName;
    }
    
    public void readOdometer() {
        System.out.println("This car has " + odometerReading + " miles on it.");
    }
    
    public void updateOdometer(int mileage) {
        if (mileage >= odometerReading) {
            odometerReading = mileage;
        } else {
            System.out.println("You cannot roll back an odometer!");
        }
    }
    
    public void incrementOdometer(int miles) {
        odometerReading += miles;
    }
}
