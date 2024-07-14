package com.mkumar.ecommerce.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mkumar.ecommerce.entites.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	Page<Product> findByProductNameLike(String keyword, Pageable pageDetails);

}