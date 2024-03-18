package com.nischita.FlipBucket;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistrationAPI {


    @PostMapping("/api/save/user")
    public void registerUser(@RequestParam String first_name,
                             @RequestParam String email,
                             @RequestParam Integer age,
                             @RequestParam String password

                             ){


        System.out.println(first_name+""+email+""+age+""+password);



        System.out.println("Request POST, Received to /api/save/user");


    }


}
