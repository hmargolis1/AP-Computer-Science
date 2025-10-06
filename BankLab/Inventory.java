public class Inventory {
    private String itemName;
    private int quantity;
    private int price;

    public Inventory(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = (int) price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (int) price;
    } 

    public String toString() {
        return "Item: " + itemName + ", Quantity: " + quantity + ", Price: $" + price;
    }

    public boolean equals(Inventory other) {
        return this.itemName.equals(other.itemName) && this.quantity == other.quantity && this.price == other.price;
    }

    public void raisePrice(double percentage) {
        price += price * (percentage/100); // or this.price = this.price * (1 + (percantage / 100);
        price = (int) price;
    }
}
