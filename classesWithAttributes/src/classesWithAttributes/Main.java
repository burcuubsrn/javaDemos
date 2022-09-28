package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Acer Laptop", 10500, 5, "Black");

		// Product product = new Product();
		// product.setName("Laptop");
		// product.setId(1);
		// product.setDescription("Acer Laptop");
		// product.setPrice(10500);
		// product.setStockAmount(5);
		// product.setColor("");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());

	}

}
