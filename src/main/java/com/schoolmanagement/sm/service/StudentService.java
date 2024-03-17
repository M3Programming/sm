/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.schoolmanagement.sm.service;

import com.schoolmanagement.sm.entity.Student;
import java.util.List;

/**
 *
 * @author MJ
 */
public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
     Student getStudentbyId(Long id);
    Student updateStudent(Student student);
    void deleteStudentbyId(Long id);
    }
