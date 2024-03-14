package com.nischita.FlipBucket;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {


    @GetMapping("/")
    public String homePageView(Model student_data){


        ArrayList<Student> students = new ArrayList<>();


        students.add(new Student("deepthi",35));

        students.add(new Student("Nischi",5));
        students.add(new Student("Vamsi",95));


        System.out.println(students);


        student_data.addAttribute("allstudents",students);


        return "home";
    }

    @GetMapping("/register")
    public String registerPageView(){


        return "register";
    }


}
