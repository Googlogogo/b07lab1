package lab4.Lab4Part2;

public class DeliveryService{
    private final GroceryStore groceryStore = new GroceryStore();
    private final DefaultBoxSizeCalculator boxSizeCalculator = new DefaultBoxSizeCalculator();
    void deliver(GroceryItem item, Customer customer) {
        if(groceryStore.itemExists(item)){
            System.out.println("Delivering " + item);
            System.out.println("Delivery service: Groceries Express");
            System.out.println("Box size: " + boxSizeCalculator.determineBoxSize(item));
            System.out.println("Address: " + customer.getPostalCode());
            groceryStore.removeItem(item);
        }
    }
}
