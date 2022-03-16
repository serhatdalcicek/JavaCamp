package nLayaredDemo.dataAccess.abstracts;

import java.util.List;

import nLayaredDemo.entities.concretes.Product;

//productdao product için veri giriş interfacemiz
//ürün listeleme ekleme güncelleme gibi kısımlar yazılır
public interface ProductDao {
	void add(Product product);

	void delete(Product product);

	void update(Product product);

	Product get(int id);

	List<Product> getAll();
}
