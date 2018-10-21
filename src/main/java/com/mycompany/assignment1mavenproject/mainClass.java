/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1mavenproject;

import java.util.ArrayList;
import org.joda.time.LocalDate;

/**
 *
 * @author MacdaraDay
 */
public class mainClass {
    
    private String courseName = "ECE";
    private LocalDate academicStartDate = new LocalDate(2018,9,01);
    private LocalDate academicEndDate = new LocalDate(2018,12,22);
   
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        studentClass ECEStudent1 = new studentClass("Macdara Day",22,"06/10/1996","ECE");
        studentClass CSITStudent1 = new studentClass("Conn O'Flynn",21,"23/08/1996","CSIT");
        studentClass ECEStudent2 = new studentClass("Ronan Murphy",20,"30/01/1998","ECE");
        studentClass CSITStudent2 = new studentClass("David Burke",21,"17/04/1996","CSIT");
        
        moduleClass SystemonChip = new moduleClass("System on Chip", "EE451");
        moduleClass SoftwareEngineering = new moduleClass("Software Engineering", "CT417");
        moduleClass WebDesign = new moduleClass("Web Design", "CT419");
        
        SystemonChip.addStudents(ECEStudent1);
        SoftwareEngineering.addStudents(ECEStudent1);
        SoftwareEngineering.addStudents(CSITStudent1);
        WebDesign.addStudents(CSITStudent1);
        SystemonChip.addStudents(ECEStudent2);
        SoftwareEngineering.addStudents(ECEStudent2);
        SoftwareEngineering.addStudents(CSITStudent2);
        WebDesign.addStudents(CSITStudent2);
        
        
        String name = ECEStudent1.getName();
        String course = ECEStudent1.getCourse();
        String username = ECEStudent1.getUsername();
        
        System.out.println("ECEStudent1 deatails: \n" +" Name: "+name +"\n Course: "+course +"\n Username: " +username+("\n\n"));
        SoftwareEngineering.printStudents();
        SystemonChip.printStudents();
        //System.out.println("Software Engineering students: "+teststudents);
    }
}
