package com.data.session05_java.ra.service;

import com.data.session05_java.ra.dao.StudentDAO;
import com.data.session05_java.ra.dao.StudentDAOImp;
import com.data.session05_java.ra.model.Student;

import java.util.List;

public class StudentServiceImp implements StudentService {
    private final StudentDAO studentDAO;

    public StudentServiceImp() {
        studentDAO = new StudentDAOImp();
    }
    @Override
    public List<Student> getAllStudents() {
            return studentDAO.getAllStudents();
        }

    @Override
    public Student getStudentById(int id) {
        return studentDAO.getStudentById(id);
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentDAO.updateStudent(student);
    }
}
