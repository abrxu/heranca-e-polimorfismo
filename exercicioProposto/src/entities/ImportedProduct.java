package entities;

public final class ImportedProduct extends Product {
	
	Double customsFee;
	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public final Double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public final String priceTag() {
		return " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
	}
	
}
