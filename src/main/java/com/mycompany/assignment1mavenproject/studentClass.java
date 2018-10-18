/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1mavenproject;

import static java.lang.Integer.max;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class studentClass {
    
    private String name;
    private int age;
    private String DOB;
    private int ID = 0;
    private String username;
    private String course;
    private String modules;
    private courseprogrammeClass Course = new courseprogrammeClass();
    
    public studentClass(){
    }
    
    public studentClass(String name, int age, String DOB, String course){
        this.name=name;
        this.age=age;
        this.DOB=DOB;
        this.course=course;
        setUsername(name, age);
        this.username=getUsername();
    }
    public void setUsername(String name, int age){
        char a_char = name.charAt(0);
        String[] splited = name.split("\\s+");
        username = a_char + splited[1] + age;
        setID();
        ID = getID();
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
    public int getID(){
        return ID;
    }
    public String getUsername(){
        return username;
    }
    public void addtoCourse(){
        if("ECE".equals(course)){
            Course.ECE(name, username, ID);
        }
        else if("CSIT".equals(course)){
            Course.CSIT(name, username, ID);
        }
    }
    public void students(){
        Course.Students();
    }
}

