package com.data.session05_java.ra.dao;

import com.data.session05_java.ra.model.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    boolean updateStudent(Student student);
}
