/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schoolmanagement.sm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

/**
 *
 * @author MJ
 */
@Entity 
@Table(name="studentinfo")

public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="firstname", nullable=false)
    private String fname;
    
    @Column(name="middlename", nullable=false)
    private String mname;
    
    @Column(name="lastname", nullable=false)
    private String lname;
    
    @Column(name="birthdate", nullable=false)
    private Date bdate;
    
    @Column(name="gender", nullable=false)
    private String gender;
    
    @Column(name="email", nullable=false)
    private String email;

    public Student(Long id, String fname, String mname, String lname, Date bdate, String gender, String email) {
        this.id = id;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.bdate = bdate;
        this.gender = gender;
        this.email = email;
    }

    public Student() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
