package com.zensar.product.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.zensar.product.bean.Product;
import com.zensar.product.service.ProductService;



@RestController
public class ProductController {
	@Autowired
	ProductService service;



	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
	return this.service.addProduct(product);
	}

	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable(name="id") int id) {
	return this.service.getProductById(id);
	}

	@DeleteMapping("/deleteProductById/{id}")
	public boolean deleteProductById(@PathVariable(name="id") int id) {
	return this.service.deleteProduct(id);
	}

	@PutMapping("/updateProduct/{id}")
	public Product updateProduct(@PathVariable(name="id")int id,@RequestBody Product product) {
	Product p1=this.service.getProductById(id);
	p1.setName(product.getName());
	p1.setDescription(product.getDescription());
	p1.setPrice(product.getPrice());
	p1.setDiscountPercentage(product.getDiscountPercentage());
	return this.service.updateProduct(p1);
	}
}
