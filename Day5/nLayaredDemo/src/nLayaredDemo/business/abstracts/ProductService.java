package nLayaredDemo.business.abstracts;

import java.util.List;

import nLayaredDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);

	List<Product> getAll();
}
