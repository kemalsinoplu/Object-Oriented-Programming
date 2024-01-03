public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            throw new IllegalArgumentException("Price must be > 0");
        }
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
        // Validation: quantity must be >= 0
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            throw new IllegalArgumentException("Price must be > 0");
        }
    }
    public String toString() {
        return String.format("Part Number: %s\nPart Description: %s\nQuantity: %d\nPrice Per Item: %.2f",
                partNumber, partDescription, quantity, pricePerItem);
    }
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}

