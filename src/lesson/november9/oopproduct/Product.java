package lesson.november9.oopproduct;

public class Product {

	
	private String productId;
	private String name;
	private double unitPrice;
	private int unitInStock;
	
	
	
	
	public Product() {
		
	}
	
	//aynı isimde metot ama farklı parametre overloading
	public Product(String productId, String name) {
	this.productId = productId;
	this.name = name;
	}
	
	
	
	//private değişkenlerimize getter ve setterlar ile erişim sağlayabiliyoruz.

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	
//	public void bilgileriGoster() {
//		System.out.println("Name: " + this.name);
//		System.out.println("Product ID: " + this.productId);
//		System.out.println("Unit Price: " + this.unitPrice);
//		System.out.println("Unit in Stock: " + this.unitInStock);
//		
//	}
	
	
	
	
}
