public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1500.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println();
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rahul Sharma", "Car");
        Vehicle v2 = new Vehicle("Priya Verma", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        updateRegistrationFee(2000.0);

        Vehicle v3 = new Vehicle("Anil Mehta", "Truck");
        v3.displayVehicleDetails();

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
