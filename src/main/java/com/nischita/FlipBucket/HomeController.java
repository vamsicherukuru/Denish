package com.nischita.FlipBucket;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;


@Controller
public class HomeController {


    @GetMapping("/")
    public String homePageView(Model student_data, Model teacher_data){


//       Sample Data
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("deepthi",35));
        students.add(new Student("Nischi",5));
        students.add(new Student("Vamsi",95));


        ArrayList<Teachers> teachers = new ArrayList<>();


        teachers.add(new Teachers("nischitha",5));
        teachers.add(new Teachers("Fayaz",8));
        teachers.add(new Teachers("Samara",10));



        teacher_data.addAttribute("all_teachers",teachers);



        student_data.addAttribute("allstudents",students);


        return "home";
    }

    @GetMapping("/register")
    public String registerPageView(){


        return "register";
    }

    @GetMapping("/login")
    public String loginPageView(){


        return "login";
    }


}
