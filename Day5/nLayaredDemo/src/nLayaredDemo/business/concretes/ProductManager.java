package nLayaredDemo.business.concretes;

import java.util.List;
//alternatif sistem buraya dahil edilmez
//manager katmanını dataccess kısmına bağlarsanız unitest yazamazsınız.unitest test edilen katmandır
import nLayaredDemo.business.abstracts.ProductService;
import nLayaredDemo.core.LoggerService;
import nLayaredDemo.dataAccess.abstracts.ProductDao;
import nLayaredDemo.dataAccess.concretes.HibernateProductDao;
import nLayaredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
     
	 private ProductDao productDao;
	 private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}
	

	@Override
	public void add(Product product) {
      //iş kodları yazılır
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor.");
			return ;//bitirir
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi : " + product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
