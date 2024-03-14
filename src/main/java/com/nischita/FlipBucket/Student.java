package com.nischita.FlipBucket;




public class Student {


    private String student_name;

    private int marks;

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(String student_name, int marks) {
        this.student_name = student_name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_name='" + student_name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
