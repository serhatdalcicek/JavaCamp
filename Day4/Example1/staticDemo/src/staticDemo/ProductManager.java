package staticDemo;

public class ProductManager {
	int bisey = 5;
	public void add(Product product) {

		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		} else {
			System.out.println("Ürün bigileri geçersizdir.");
		}
          ProductValidator productValidator = new ProductValidator();
          productValidator.bisey();
		
	}
}
