package com.nischita.FlipBucket;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teachers {


    private String teacher_name;

    private Integer class_level;


    @Override
    public String toString() {
        return teacher_name + " " + class_level;
    }


}
