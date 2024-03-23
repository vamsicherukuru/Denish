package com.nischita.FlipBucket;


import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentAPI {

    public static ArrayList<MyStudent> all_student_repo = new ArrayList<>();

    @PostMapping("/api/add/student")
    public void addStudentAPI(@RequestParam String student_name,
                              @RequestParam String student_id,
                              @RequestParam String student_email,
                              @RequestParam String level
                              ){


        try {
            all_student_repo.add(new MyStudent(student_name, student_id, student_email, level));

        }catch (Exception e){
            System.out.println("Something Went Wrong");
        }



        System.out.println(all_student_repo);
    }



    public static ArrayList<MyStudent> getMyStudentList(){


        return all_student_repo;
    }









}
