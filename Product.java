package prasantkumarLTDTask2;

public class Product {
    private String name;
    private int stockLevel;

    // Constructor
    public Product(String name, int stockLevel) {
        this.name = name;
        this.stockLevel = stockLevel;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    // Method to reduce stock by a certain amount
    public boolean reduceStock(int quantity) {
        if (stockLevel >= quantity) {
            stockLevel -= quantity;
            return true;
        } else {
            return false;
        }
    }

    // Method to restock product
    public void restock(int quantity) {
        stockLevel += quantity;
    }
}

