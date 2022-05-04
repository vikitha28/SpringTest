package com.zensar.product.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.product.bean.Product;
import com.zensar.product.db.ProductDAO;
@Service
public class ProductService {
	@Autowired
	ProductDAO dao;

	public Product addProduct(Product product) {
	return this.dao.save(product);
	}

	public boolean deleteProduct(int id) {
	this.dao.deleteById(id);
	return true;
	}
	public List<Product> getAllProducts(){
	return this.dao.findAll();
	}
	public Product updateProduct(Product product) {
		return this.dao.save(product);
		}
	public Product getProductById(int id) {
	Optional<Product> optional=this.dao.findById(id);
	if(optional.isPresent())
	return optional.get();
	return null;
	}
}
