/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1mavenproject;

import java.util.Date;

public class studentClass {
    
    private String name;
    private int age;
    private String DOB;
    private int ID;
    private String username;
    private String course;
    private String modules;
    private courseprogrammeClass Course;
    
    public studentClass(){
    }
    
    public studentClass(String name, int age, String DOB, String course){
        this.name=name;
        this.age=age;
        this.DOB=DOB;
        this.course=course;
        setUsername(name, age);
    }
    public void setUsername(String name, int age){
        char a_char = name.charAt(0);
        String[] splited = name.split("\\s+");
        username = a_char + splited[1] + age;
    }
    public String getUsername(){
        return username;
    }
    public void addtoCourse(){
        if("ECE".equals(course)){
            Course.ECE(name, username, ID);
        }
        else if("CS & IT".equals(course)){
            Course.CSIT(name, username, ID);
        }
    }
}

