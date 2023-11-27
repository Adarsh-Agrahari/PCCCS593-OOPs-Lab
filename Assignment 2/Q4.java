// Q4.	Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An Invoice should include four pieces of information as instance variables— a part number (type String), a part description (type String), a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each instance variable. In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities.

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity); // Call the setQuantity method to ensure it's not negative
        setPricePerItem(pricePerItem); // Call the setPricePerItem method to ensure it's not negative
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

public class Q4 {
    public static void main(String[] args) {
        // Create Invoice objects
        Invoice invoice1 = new Invoice("12345", "Widget", 5, 9.99);
        Invoice invoice2 = new Invoice("67890", "Gadget", -2, -4.99); // Demonstrate negative quantity and price

        // Display invoice details and amounts
        displayInvoice(invoice1);
        displayInvoice(invoice2);
    }

    public static void displayInvoice(Invoice invoice) {
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
        System.out.println();
    }
}

// Sample Output

// Original invoice information
// Part number: 1234
// Descri ption: Hammer
// Quanti ty: 2
// Price: 14.95
// Invoice amount: 29.90

// Updated invoice information
// Part number: 001234
// Descri ption: Yel low Hammer
// Quanti ty: 3
// Price: 19.49
// Invoice amount: 58.47

// Original invoice information
// Part number: 5678
// Description: Paint Brush
// Quanti ty: 0
// Price: 0.00
// Invoice amount: 0.00

// Updated invoice information
// Part number: 5678
// Description: Paint Brush
// Quanti ty: 3
// Price: 9.49
// Invoice amount: 28.47