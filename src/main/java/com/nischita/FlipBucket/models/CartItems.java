package com.nischita.FlipBucket.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItems {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer item_id;


    private String item_name;

    private Integer item_quantity;


    private Double item_price;

}
