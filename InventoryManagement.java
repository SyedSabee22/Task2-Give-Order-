package prasantkumarLTDTask2;

import java.util.List;

public class InventoryManagement {

	public static void processOrders(List<Product> products, List<Order> orders) {
        for (Order order : orders) {
            Product product = findProductByName(products, order.getProductName());
            if (product != null) {
                if (!product.reduceStock(order.getQuantity())) {
                    System.out.println("Error: Insufficient stock for product " + order.getProductName());
                } else {
                    System.out.println("Processed order for " + order.getQuantity() + " units of " + order.getProductName());
                    if (product.getStockLevel() < 10) {
                        System.out.println("Alert: Stock of " + product.getName() + " is below threshold. Consider restocking.");
                    }
                }
            } else {
                System.out.println("Error: Product " + order.getProductName() + " not found.");
            }
        }
    }

    // Helper method to find a product by name
    private static Product findProductByName(List<Product> products, String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;  // Product not found
    }
    // Method to restock items
    public static void restockItems(List<Product> products, List<RestockOrder> restockOrders) {
        for (RestockOrder restockOrder : restockOrders) {
            Product product = findProductByName(products, restockOrder.getProductName());
            if (product != null) {
                product.restock(restockOrder.getQuantity());
                System.out.println("Restocked " + restockOrder.getQuantity() + " units of " + restockOrder.getProductName());
            } else {
                System.out.println("Error: Product " + restockOrder.getProductName() + " not found.");
            }
        }
    }
}

