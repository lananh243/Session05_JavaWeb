package com.data.session05_java.ra.service;

import com.data.session05_java.ra.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public static List<Student> students = new ArrayList<>();

     static {
         students.add(new Student(1, "Nguyen Van A", 20, "Ha Nam"));
         students.add(new Student(2, "Tran Thi B", 23, "Ha Noi"));
         students.add(new Student(3, "Nguyen Van C", 24, "Ha Tinh"));
         students.add(new Student(4, "Nguyen Van Du", 25, "Nghe An"));

         students.add(new Student(5, "Le Thi E", 21, "Thanh Hoa"));
         students.add(new Student(6, "Pham Van F", 22, "Hue"));
         students.add(new Student(7, "Hoang Thi G", 23, "Da Nang"));
         students.add(new Student(8, "Nguyen Van H", 24, "Quang Nam"));
         students.add(new Student(9, "Tran Thi I", 25, "Quang Ngai"));
         students.add(new Student(10, "Pham Van J", 20, "Binh Dinh"));

         students.add(new Student(11, "Nguyen Van K", 21, "Phu Yen"));
         students.add(new Student(12, "Tran Thi L", 22, "Nha Trang"));
         students.add(new Student(13, "Le Van M", 23, "Lam Dong"));
         students.add(new Student(14, "Hoang Thi N", 24, "Dong Nai"));
         students.add(new Student(15, "Nguyen Van O", 25, "Binh Duong"));

         students.add(new Student(16, "Tran Thi P", 22, "TP. HCM"));
         students.add(new Student(17, "Pham Van Q", 23, "Long An"));
         students.add(new Student(18, "Nguyen Van R", 24, "Tien Giang"));
         students.add(new Student(19, "Hoang Thi S", 25, "Ben Tre"));
         students.add(new Student(20, "Le Van T", 20, "Vinh Long"));
    }
}
