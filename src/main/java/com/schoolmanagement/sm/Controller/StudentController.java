/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schoolmanagement.sm.Controller;

import com.schoolmanagement.sm.entity.Student;
import com.schoolmanagement.sm.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author MJ
 */
@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //method to handle the list of students to view
    @GetMapping("/Students")
    public String listStudents(Model model) {
        model.addAttribute("Students", studentService.getAllStudents());
        return "Students";
    }

    @GetMapping("/Students/new")
    public String studentForm(Model model) {
        Student student = new Student();
        model.addAttribute("Student", student);
        return ("AddStudent");
    }
    
    @PostMapping("/Students")
    public String saveStudent(@ModelAttribute("Students")Student student){
        studentService.saveStudent(student);
        return "redirect:/Students";
    }
   @GetMapping("/Students/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentbyId(id));
        return "edit_student";
    }
    
   @PostMapping("/Students/{id}" )
    public String updateStudent(@PathVariable Long id,
            @ModelAttribute("Students") Student student, Model model){
        Student existingStudent = studentService.getStudentbyId(id);
        existingStudent.setFname(student.getFname());
        existingStudent.setMname(student.getMname());
        existingStudent.setLname(student.getLname());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setBdate(student.getBdate());
        existingStudent.setGender(student.getGender());
        studentService.updateStudent(existingStudent);
        return "redirect:/Students";
        
    }
    @GetMapping("Students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentbyId(id);
        return "redirect:/Students";
    }
}
