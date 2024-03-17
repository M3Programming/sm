/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schoolmanagement.sm.serviceimplementation;

import com.schoolmanagement.sm.entity.Student;
import com.schoolmanagement.sm.repository.StudentRepository;
import com.schoolmanagement.sm.service.StudentService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author MJ
 */
@Service
public class StudentServiceImp implements StudentService{ 

    private final StudentRepository studentRepository;
    
    public StudentServiceImp(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentbyId(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
       return studentRepository.save(student);
    }

    @Override
    public void deleteStudentbyId(Long id) {
        studentRepository.deleteById(id);
    }
}
