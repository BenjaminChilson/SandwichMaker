package sandwichmaker;

import java.util.HashMap;
import java.util.Map;

public class Sandwich extends MyItem{

    private String breadType;
    private String sandwichType;
    private HashMap<String, IngredientQuantity> sandwichContents;

    public Sandwich(){
        sandwichContents = new HashMap<>();
    }

    public void addIngredient(String ingredient, Double price){
        addIngredient(ingredient, price, IngredientQuantity.NORMAL);
        
    }

    public void addIngredient(String ingredient, Double price, IngredientQuantity quantity){
        sandwichContents.put(ingredient, quantity);
        increasePrice(price); 
    }

	@Override
	public void printItem() {
		System.out.println(breadType + " Bread");
        for(Map.Entry<String, IngredientQuantity> entry: sandwichContents.entrySet()){
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
		
	}
	
	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}
	
	public void setSandwichType(String sandwichType, Double price) {
		this.sandwichType = sandwichType;
		increasePrice(price);
	}
	
	public String getSandwichType() {
		return sandwichType;
	}
	
	public HashMap<String, IngredientQuantity> getSandwichContents(){
		return sandwichContents;
	}
    


}
