package nLayaredDemo;

import nLayaredDemo.business.abstracts.ProductService;
import nLayaredDemo.business.concretes.ProductManager;
import nLayaredDemo.core.JLoggerManagerAdapter;
import nLayaredDemo.dataAccess.concretes.AbcProductDao;
import nLayaredDemo.dataAccess.concretes.HibernateProductDao;
import nLayaredDemo.entities.concretes.Product;

//bir projede entityler hariç newleme yaparsan problem yaşarsın
//concretes=somut ve işi yapan kısımlardır
//abstract=soyut ve sisteme anlatması gereken kısımdır.bir class interface veya base ile süslenmesi gerekiyor
public class Main {

	public static void main(String[] args) {
        //ToDo : Spring IoC ile çözülecek
		ProductService productService = new ProductManager(new AbcProductDao()
				,new JLoggerManagerAdapter()); 
		Product product = new Product(1, 2,"Elma", 12, 50); 
				productService.add(product);
	}

}
