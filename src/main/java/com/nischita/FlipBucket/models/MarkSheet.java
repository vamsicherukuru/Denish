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
public class MarkSheet {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mid;

    private String studentName;

    private Integer year;

    private Integer mathMarks;

    private Integer physicsMarks;

    private Integer chemistryMarks;

    private Boolean passed;

    @Override
    public String toString() {
        return "MarkSheet{" +
                "mid=" + mid +
                ", studentName='" + studentName + '\'' +
                ", year='" + year + '\'' +
                ", mathMarks=" + mathMarks +
                ", physicsMarks=" + physicsMarks +
                ", chemistryMarks=" + chemistryMarks +
                ", passed=" + passed +
                '}';
    }
}
