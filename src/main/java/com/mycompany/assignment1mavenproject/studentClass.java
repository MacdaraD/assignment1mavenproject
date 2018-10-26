/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1mavenproject;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import org.joda.time.LocalDate;

public class studentClass {
    
    private String name;
    private int age;
    private String DOB;
    private int ID = 0;
    private String username;
    private String course;
    private LocalDate academicStartDate = new LocalDate(2018,9,01);
    private LocalDate academicEndDate = new LocalDate(2018,12,22);
    private static ArrayList<String> allusernames = new ArrayList<String>();
   
    public studentClass(){
    }
    
    public studentClass(String name, int age, String DOB, String course){
        this.name=name;
        this.age=age;
        this.DOB=DOB;
        this.course=course;
        setUsername(name, age);
        this.username=getUsername();
        addtoCourse(course, academicStartDate, academicEndDate);
    }
    public String getName(){
        return name;
    }
    public String getDOB(){
        return DOB;
    }
    public void setUsername(String name, int age){
        char a_char = name.charAt(0);
        String[] splited = name.split("\\s+");
        username = a_char + splited[1] + age;
        setID();
        ID = getID();
        allusernames.add(username);
    }
    public void setID(){
        if(ID==0){
        int min = 10000000;
        int max = 19999999;
        ID = ThreadLocalRandom.current().nextInt(min, max + 1);
        }else{
            ID=ID;
        }
    }
    public void addtoCourse(String courseName, LocalDate academicStartDate,LocalDate academicEndDate){
       courseprogrammeClass Course = new courseprogrammeClass(name, courseName, academicStartDate, academicEndDate);
       Course.addCourse(name);
    }
    public int getID(){
        return ID;
    }
    public int getAge(){
        return age;
    }
    public String getallUsernames(){
        String user = "";
        for(String temp : allusernames){
            user += temp + " ";
        }
        return user;
    }
    public String getUsername(){
        return username;
    }
    public String getCourse(){
        return course;
    }
}

