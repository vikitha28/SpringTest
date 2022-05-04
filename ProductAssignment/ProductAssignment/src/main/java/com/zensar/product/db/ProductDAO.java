package com.zensar.product.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.product.bean.Product;
@Repository
public interface ProductDAO extends JpaRepository<Product,Integer> {

}
