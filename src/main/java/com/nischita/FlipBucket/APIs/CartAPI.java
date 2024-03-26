package com.nischita.FlipBucket.APIs;


import com.nischita.FlipBucket.models.CartItems;
import com.nischita.FlipBucket.repo.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartAPI {




    @Autowired
    CartItemRepository cartItemRepository;


    @PostMapping("/api/add-to-cart")
    public void saveItemtoCart(@RequestParam String item_name,
                               @RequestParam Integer item_quantity,
                               @RequestParam Double item_price
                               ){

        CartItems cartItems = new CartItems();
        cartItems.setItem_name(item_name);
        cartItems.setItem_price(item_price);
        cartItems.setItem_quantity(item_quantity);

        System.out.println(cartItems);

        cartItemRepository.save(cartItems);





    }
}
