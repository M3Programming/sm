/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.schoolmanagement.sm.repository;

import com.schoolmanagement.sm.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author MJ
 */
public interface StudentRepository extends JpaRepository<Student,Long> {
    
}
