public class Item {
    int itemCode;
    String itemName;
    double price;
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public static void main(String[] args) {
        Item item1 = new Item(101, "Wireless Mouse", 599.99);
        item1.displayDetails();
        int quantity = 3;
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: ₹" + totalCost);
    }
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: ₹" + price);
    }
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

}
