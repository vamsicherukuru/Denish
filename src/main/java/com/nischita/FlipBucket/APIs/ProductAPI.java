package com.nischita.FlipBucket.APIs;


import com.nischita.FlipBucket.Product;
import com.nischita.FlipBucket.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductAPI {


    @Autowired
    ProductRepository productRepository;


    @PostMapping("/api/save/product")
    public ResponseEntity<Product> saveProductDB(@RequestParam String product_name,
                                                 @RequestParam String product_category,
                                                 @RequestParam Double price
                                                 ){

        Product product = new Product();
        product.setProduct_category(product_category);
        product.setProduct_name(product_name);
        product.setPrice(price);



        productRepository.save(product);


        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }
}
