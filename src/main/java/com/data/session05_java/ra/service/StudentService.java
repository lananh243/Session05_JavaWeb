package com.data.session05_java.ra.service;

import com.data.session05_java.ra.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    boolean updateStudent(Student student);
}
