/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1mavenproject;

import java.util.ArrayList;

/**
 *
 * @author MacdaraDay
 */
public class moduleClass {
    
    private String moduleName;
    private String moduleCode;
    private ArrayList<String> students;
    private ArrayList<String> courses;
    
    public moduleClass(String moduleName, String moduleCode){
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
    }
    
    public void addStudents(String name){
        students.add(name);
    }
    
    public ArrayList<String> getStudents(){
        return students;
    }
}
