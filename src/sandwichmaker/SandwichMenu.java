package sandwichmaker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SandwichMenu implements Menu{

	private HashMap<String, Double> sandwichTypeCatelog;
	private HashMap<String, Double> breadTypeCatelog;
	private HashMap<String, Double> ingredientCatelog;
	private Scanner scanner;
	
	public SandwichMenu() {
		scanner = new Scanner(System.in);
		
		sandwichTypeCatelog = new HashMap<>();
		sandwichTypeCatelog.put("Turkey and Cheese", 5.00);
		sandwichTypeCatelog.put("Ham and Cheese", 5.00);
		sandwichTypeCatelog.put("BLT", 5.00);
		sandwichTypeCatelog.put("Meatball", 5.00);
		
		breadTypeCatelog = new HashMap<>();
		breadTypeCatelog.put("White", 0.00);
		breadTypeCatelog.put("Wheat", 0.00);
		
		ingredientCatelog = new HashMap<>();
		ingredientCatelog.put("Lettuce", 0.00);
		ingredientCatelog.put("Tomato", 0.00);
		ingredientCatelog.put("Pickles", 0.00);
		ingredientCatelog.put("Olives", 0.00);
		ingredientCatelog.put("Bacon", 0.50);
	}
	
	@Override
	public void addListing(String itemName, Double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListing(String itemName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MyItem placeOrder() {
		Sandwich sandwich = new Sandwich();
		
		System.out.println("----BREAD OPTIONS----");
		displayBreadTypeCatelog();
		System.out.println("\nSelect the bread:");
		sandwich.setBreadType(getCatelogSelection(breadTypeCatelog));

		System.out.println("----SANDWICH TYPE OPTIONS----");
		displaySandwichTypeCatelog();
		System.out.println("\nSelect the type of sandwich:");
		String selection = getCatelogSelection(sandwichTypeCatelog);
		sandwich.setSandwichType(selection, sandwichTypeCatelog.get(selection));
		System.out.println(sandwich.getSandwichType());
		
		System.out.println("----INGREDIENT OPTIONS----");
		displayIngredientCatelog();
		System.out.println("\nSelect the ingredientsh:\nTYPE DONE WHEN YOU ARE DONE SELECTING");
		
		do {
			selection = getContinuedCatelogSelection(ingredientCatelog);
			if(selection.equals("DONE") == false) {
				sandwich.addIngredient(selection, ingredientCatelog.get(selection));
			}
		} while(selection.equals("DONE") != true);
		
		for(Map.Entry<String, IngredientQuantity> entry: sandwich.getSandwichContents().entrySet())
			System.out.println(String.format("%20s\t%s", entry.getKey(), entry.getValue()));
		
		return sandwich;
		
	}
	
	private void displayBreadTypeCatelog() {
		for (Map.Entry<String, Double> entry : breadTypeCatelog.entrySet()) {
			System.out.println(String.format("%-20s\t$%.2f", entry.getKey(), entry.getValue()));
		}
	}
	
	private void displaySandwichTypeCatelog() {
		for (Map.Entry<String, Double> entry : sandwichTypeCatelog.entrySet()) {
			System.out.println(String.format("%-20s\t$%.2f", entry.getKey(), entry.getValue()));
		}
	}
	
	private void displayIngredientCatelog() {
		for (Map.Entry<String, Double> entry : ingredientCatelog.entrySet()) {
			System.out.println(entry.getKey());
		}
	}
	
	private String getCatelogSelection(HashMap<String, Double> catelog) {
		String selection = scanner.nextLine();
		while(catelog.containsKey(selection) != true)
			selection = scanner.nextLine();
		return selection;
	}
	
	private String getContinuedCatelogSelection(HashMap<String, Double> catelog) {
		String selection = scanner.nextLine();
		while(catelog.containsKey(selection) != true && selection.equals("DONE") != true) {
			selection = scanner.nextLine();
			System.out.println("Not in catelog, Try Again");
		}
		if(selection.equals("DONE"))
			return "DONE";
		
		return selection;
	}

}
