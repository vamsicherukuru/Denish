package com.nischita.FlipBucket;


import com.nischita.FlipBucket.models.MarkSheet;
import com.nischita.FlipBucket.repo.MarkSheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;


@Controller
public class HomeController {

    @Autowired
    MarkSheetRepository markSheetRepository;
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



    @GetMapping("/add-product")
    public String addProductPageView(){


        return "add-product";
    }



    @GetMapping("/add-student")
    public String addStudentPage(){
        return "add-student";
    }

    @GetMapping("/student-list")
    public String studentListPage(Model student_list){

//        for (MyStudent myStudent : StudentAPI.all_student_repo) {
//            System.out.println(myStudent);
//        }

        System.out.println(StudentAPI.getMyStudentList());

        student_list.addAttribute("student_list",StudentAPI.getMyStudentList());


        return "student-list";
    }



    @GetMapping("/add-to-cart")
    public String addToCartPage(){

        return "add-cart";
    }



    @GetMapping("/student-data")
    public String marksheetPage( Model model){


        ArrayList<MarkSheet> all_students_marks =  new ArrayList<>(markSheetRepository.findAll());

        System.out.println(all_students_marks);
        model.addAttribute("all_students_marks", all_students_marks);

        return "mark-sheet";
    }



}
