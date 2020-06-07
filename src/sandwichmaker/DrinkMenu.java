package sandwichmaker;

import java.util.HashMap;

public class DrinkMenu implements Menu{
	
	private HashMap<String, Double> drinkCatelog;
	
	public DrinkMenu(){
		drinkCatelog = new HashMap<>();
	}
	
	Drink placeDrinkOrder() {
		Drink drink = new Drink();
		
		
		return drink;
	}

	@Override
	public void addListing(String itemName, Double price){
		drinkCatelog.put(itemName, price);
		
	}

	@Override
	public void removeListing(String itemName){
		drinkCatelog.remove(itemName);
		
	}

	@Override
	public MyItem placeOrder() {
		presentMenu();
		Drink drink = new Drink();
		
		
		return drink;
	}
	
	private void presentMenu() {
		System.out.println("---------------Drink Menu------------------");
		System.out.println("\tSODA:");
		System.out.println("\tORANGE JUICE");
		System.out.println("\tWATER");
		System.out.println("\tCOFFEE");
		System.out.println("\t");
	}
	
	
}
