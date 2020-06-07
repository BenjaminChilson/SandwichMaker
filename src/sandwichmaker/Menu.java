package sandwichmaker;

public interface Menu {
	
	void addListing(String itemName, Double price);
	void removeListing(String itemName);
	MyItem placeOrder();
}
