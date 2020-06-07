package sandwichmaker;

import java.util.Arrays;
import java.util.Scanner;

public class Drink extends MyItem {
	private DrinkSize size;
	private DrinkType type;
	
	public Drink() {
		System.out.println("Please choose a drink type");
		Scanner scanner = new Scanner(System.in);
		
		int selection = 0;
		while(selection <=0 || selection >= 4) {
			System.out.println(Arrays.asList(DrinkType.values()));
			selection = scanner.nextInt();
			switch(selection) {
				case 1:
					type = DrinkType.DR_PEPPER;
					break;
				case 2:
					type = DrinkType.SPRITE;
					break;
				case 3:
					type = DrinkType.SPRITE;
				case 4:
					type = DrinkType.MTN_DEW;
					break;
				default:
					System.out.println("No soda of that type");
				
			}
			
		}
		selection = 0;
		while(selection <= 0 || selection > 3) {
			System.out.println("Select the size of your drink");
			System.out.println(Arrays.asList(DrinkSize.values()));
			selection = scanner.nextInt();
			switch(selection) {
				case 1:
					size = DrinkSize.SMALL;
					break;
				case 2:
					size = DrinkSize.MEDIUM;
					break;
				case 3:
					size = DrinkSize.LARGE;
					break;
				default:
					System.out.println("This is not a valid drink size");
			}
		}
		scanner.close();
	}

	@Override
	public void printItem() {
		System.out.println("You ordered a " + size + " " + type);
		
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

}
