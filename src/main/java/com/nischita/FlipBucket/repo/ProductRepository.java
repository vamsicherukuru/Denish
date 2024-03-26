package com.nischita.FlipBucket.repo;


import com.nischita.FlipBucket.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {



}
