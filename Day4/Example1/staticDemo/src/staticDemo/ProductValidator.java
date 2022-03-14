package staticDemo;

//static sadece bir defa kullanılmasına yarar
//! işareti değilse anlamına gelir.
public class ProductValidator {
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}

public static boolean isValid(Product product) {
	if(product.price>0 && !product.name.isEmpty()) {
		return true;
	}else {
		return false;
	}
	
}
public void bisey() {
	
}
}
