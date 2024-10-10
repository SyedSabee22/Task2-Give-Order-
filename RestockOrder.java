package prasantkumarLTDTask2;

public class RestockOrder {
    private String productName;
    private int quantity;

    // Constructor
    public RestockOrder(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

