package com.nischita.FlipBucket;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MyStudent {



    private String student_name;

    private String student_id;

    private String student_email;


    private String student_class;


    @Override
    public String toString() {
        return "MyStudent{" +
                "student_name='" + student_name + '\'' +
                ", student_id='" + student_id + '\'' +
                ", student_email='" + student_email + '\'' +
                ", student_class='" + student_class + '\'' +
                '}';
    }
}
