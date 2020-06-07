package sandwichmaker;

public interface Cart {
	void addItem(MyItem item, int quantityToAdd);
	void deleteItem(MyItem item, int quantityToDelete);
	void printOrder();
}
