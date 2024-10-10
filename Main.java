package prasantkumarLTDTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Creating products
    	Scanner scn= new Scanner(System.in);
        Product product1 = new Product("Laptop", 20);
        Product product2 = new Product("Smartphone",  50);
        Product product3 = new Product( "Refrigerator",  40);
        Product product4 = new Product("Ovan", 70);
        Product product5 = new Product( "Washing Machine",  10);

        // Create user
         System.out.println("Enter your user Id");
        int id= scn.nextInt();scn.nextLine();
        System.out.println("Enter Your Name");
         String name=scn.nextLine();
         System.out.println("Enter Your Authorized Email_Id");
          String email=scn.nextLine();
        

        // Adding products to the inventory
        List<Product> inventory = new ArrayList<>();
        inventory.add(product1);
        inventory.add(product2);
        inventory.add(product3);
        inventory.add(product4);
        inventory.add(product5);
        
        

        // Creating sales orders
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Laptop", 10));
        orders.add(new Order("Smartphone", 6));  // This should trigger an error (insufficient stock)

        // Processing the orders
        InventoryManagement.processOrders(inventory, orders);

        // Restocking products
        List<RestockOrder> restockOrders = new ArrayList<>();
        restockOrders.add(new RestockOrder("Smartphone", 20));  // Restocking Phone
        restockOrders.add(new RestockOrder("Refrigerator", 10));  // Restocking Headphones

        // Restocking the products
        InventoryManagement.restockItems(inventory, restockOrders);
    }
}

