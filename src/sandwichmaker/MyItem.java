package sandwichmaker;

public abstract class MyItem {
	
	
	private Double price;
	
	public MyItem(){
		price = 0.00;
	}
	
	public void increasePrice(Double priceToAdd) {
		price += priceToAdd;
	}
	
	
	public abstract void printItem();
	
	public Double getPrice() {
		return price;
	}
	
	public void printPrice() {
		System.out.println(String.format("TOTAL:\t$%.2f", price));
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
}
