/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1mavenproject;

import java.util.ArrayList;
import java.util.Arrays;
import org.joda.time.LocalDate;

/**
 *
 * @author MacdaraDay
 */
public class courseprogrammeClass {
    
    private ArrayList<String> modules = new ArrayList<String>();
    //private static ArrayList<String> CSITmodules = new ArrayList<String>(Arrays.asList("Software Engineering", "Web Design"));
    private static ArrayList<studentClass> SystemonChip = new ArrayList<studentClass>(); 
    private static ArrayList<String> allstudents = new ArrayList<String>();
    private ArrayList<String> students = new ArrayList<String>();
    //private static moduleClass modules = new moduleClass();
    private String studentName;
    private String courseName;
    private moduleClass module;
    private LocalDate academicStartDate;
    private LocalDate academicEndDate;
    
    public courseprogrammeClass(String studentName,String courseName, LocalDate academicStartDate,LocalDate academicEndDate) {
       this.studentName = studentName;
       this.courseName = courseName;
       this.academicStartDate = academicStartDate;
       this.academicEndDate = academicEndDate;
    }

    public courseprogrammeClass(String module1, String module2) {
        modules.add(module1);
        modules.add(module2);
    }
    public String getModules(){
        String module = "";
        for (String temp : modules){
            module += temp + " ";
        }
        return module;
    }
    public String getcourseName(){
        return courseName;
    }
    public LocalDate getacademicStartDate(){
        return academicStartDate;
    }
    public LocalDate getacademicEndDate(){
        return academicEndDate;
    }
    public void addCourse(String studentName){
       allstudents.add(studentName);
       students.add(studentName);
    }
    public String getallStudents(){
        String student = "";
        for(String temp : allstudents){
            student += temp + " ";
        }
        return student;
    }
}
