public class CabInvoiceGenerator {

    private static final int Cost_Km = 10;
    private static final int COST_PER_MIN = 1;
    private static final int MINIMUM_FARE = 5;

    public double calculateFare(double distance, int time) {
        double totalFare = distance * Cost_Km + time * COST_PER_MIN;
        return Math.max(totalFare, MINIMUM_FARE);
    }

    public static void main(String[] args) {
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        double fare1 = generator.calculateFare(2.0, 5);
        double fare2 = generator.calculateFare(0.1, 1);
        System.out.println("Fare 1: Rs. " + fare1);
        System.out.println("Fare 2: Rs. " + fare2);
    }
}
