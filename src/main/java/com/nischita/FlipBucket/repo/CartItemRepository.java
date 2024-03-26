package com.nischita.FlipBucket.repo;

import com.nischita.FlipBucket.models.CartItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CartItemRepository extends JpaRepository<CartItems,Integer> {


}
