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
    private String name;
    private ArrayList<studentClass> students = new ArrayList<studentClass>();
    private ArrayList<String> courses;
    
    public moduleClass(String moduleName, String moduleCode){
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
    }
    
    public void printStudents(){
        System.out.println(moduleName +" students are ");
        for(studentClass temp : students){
            String student = temp.getName() +" "+ temp.getUsername();
            System.out.println(student);
        }
    }

    public void addStudents(studentClass ECEStudent1) {
        students.add(ECEStudent1);
    }
}
