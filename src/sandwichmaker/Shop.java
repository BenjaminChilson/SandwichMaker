package sandwichmaker;

public class Shop {
	
	private static Shop shop;
	private SandwichMenu sandwichMenu;
	private DrinkMenu drinkMenu;
	
	
	private Shop() {
		sandwichMenu = new SandwichMenu();
		drinkMenu = new DrinkMenu();
	}
	
	public static Shop getShop() {
		if(shop == null)
			shop = new Shop();
		
		return shop;
	}
	
	
}
