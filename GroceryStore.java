package lab4.Lab4Part2;

import java.util.HashSet;

public class GroceryStore {
	
	HashSet<GroceryItem> items;
	
	public GroceryStore() {
		items = new HashSet<GroceryItem>();
	}
	
	public void addItem(GroceryItem item) {
		items.add(item);
	}
	
	public void removeItem(GroceryItem item) {
		items.remove(item);
	}
	
	public boolean itemExists(GroceryItem item) {
		return items.contains(item);
	}

}
