package com.data.session05_java.ra.dao;

import com.data.session05_java.ra.model.Student;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImp implements  StudentDAO {

    @Override
    public List<Student> getAllStudents() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Student> students = null;
        try {
            conn = ra.com.utils.ConnectionDB.openConnection();
            callSt = conn.prepareCall("{get_all_student()}");
            ResultSet rs = callSt.executeQuery();
            students = new ArrayList<>();
            while (rs.next()){
                Student student = new Student();
                student.setId(rs.getInt("student_id"));
                student.setStudentName(rs.getString("student_name"));
                student.setAge(rs.getInt("age"));
                student.setAddress(rs.getString("address"));
                students.add(student);
                System.out.println("Sinh viên: " + student.getStudentName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ra.com.utils.ConnectionDB.closeConnection(conn, callSt);
        }
        return students;
    }

    @Override
    public Student getStudentById(int id) {
        Connection conn = null;
        CallableStatement callSt = null;
        Student student = null;
        try {
            conn = ra.com.utils.ConnectionDB.openConnection();
            callSt = conn.prepareCall("{get_Student_by_id(?)}");
            callSt.setInt(1, id);
            ResultSet rs = callSt.executeQuery();
            student = new Student();
            while (rs.next()){
                student.setId(rs.getInt("student_id"));
                student.setStudentName(rs.getString("student_name"));
                student.setAge(rs.getInt("age"));
                student.setAddress(rs.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ra.com.utils.ConnectionDB.closeConnection(conn, callSt);
        }
        return student;
    }

    @Override
    public boolean updateStudent(Student student) {
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ra.com.utils.ConnectionDB.openConnection();
            callSt = conn.prepareCall("{update_student(?,?,?,?)}");
            callSt.setInt(1, student.getId());
            callSt.setString(2, student.getStudentName());
            callSt.setInt(3, student.getAge());
            callSt.setString(4, student.getAddress());
            callSt.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
