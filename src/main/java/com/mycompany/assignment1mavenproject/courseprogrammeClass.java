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
    
    private static ArrayList<String> ECEmodules = new ArrayList<String>(Arrays.asList("System on Chip","Software Engineering"));
    private static ArrayList<String> CSITmodules = new ArrayList<String>(Arrays.asList("Software Engineering", "Web Design"));
    private static ArrayList<studentClass> SystemonChip = new ArrayList<studentClass>(); 
    private static ArrayList<String> ECEstudents = new ArrayList<String>();
    private static ArrayList<String> CSITstudents = new ArrayList<String>();
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

    courseprogrammeClass() {
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
        if("ECE".equals(courseName)){
            ECEstudents.add(studentName);
            addECEmodules();
        }
        else if("CSIT".equals(courseName)){
            CSITstudents.add(studentName);
            addCSITmodules();
        }
        else{
            System.out.println("Course "+courseName+" not found.");
        }
    }
    public void addECEmodules(){
        for(String temp : ECEmodules){
            
            System.out.println("Attempting to add "+studentName +" to "+temp);
        }
    }
    public void addCSITmodules(){
        for(String temp : CSITmodules){
            
            System.out.println("Attempting to add "+studentName +" to "+temp);
        }
    }
    public static ArrayList getECEstudents(){
        return ECEstudents;
    }
    public static ArrayList getCSITstudents(){
        return CSITstudents;
    }
    public void Students(){
        System.out.println("ECE students "+ECEstudents);
        System.out.println("CS&IT students "+CSITstudents);
    }
}
