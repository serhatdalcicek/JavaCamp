package nLayaredDemo.dataAccess.concretes;

import java.util.List;

import nLayaredDemo.dataAccess.abstracts.ProductDao;
import nLayaredDemo.entities.concretes.Product;

//dao içerisinde veriye erişim kodlarımızı yazacağız
//her concretesin bir abstracts dosyası olacaktır
//hibernate = veri erişim katmanıdır ve veri tabanı ile iletişim kuran java yapısıdır.
public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile eklendi."+ product.getName());
	}

	@Override
	public void delete(Product product) {
		System.out.println("Hibernate ile silindi.");

	}

	@Override
	public void update(Product product) {
		System.out.println("Hibernate ile güncellendi.");

	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
