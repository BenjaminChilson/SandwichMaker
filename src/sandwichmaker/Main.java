package sandwichmaker;

public class Main {

	public static void main(String[] args) {
		
		SandwichMenu menu = new SandwichMenu();
		Sandwich sandwich1 = (Sandwich)menu.placeOrder();
		sandwich1.printItem();
		sandwich1.printPrice();
		
        
	}

}
