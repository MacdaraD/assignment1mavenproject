/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1mavenproject;

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
        studentClass exampleECEStudent = new studentClass("Macdara Day",22,"06/10/1996","ECE");
        studentClass exampleCSITStudent = new studentClass("Conn O'Flynn",21,"23/08/1996","CSIT");
        studentClass exampleECEStudent1 = new studentClass("Ronan Murphy",20,"30/01/1998","ECE");
        studentClass exampleCSITStudent1 = new studentClass("David Burke",21,"17/04/1996","CSIT");
        //String usernameECE = exampleECEStudent.getUsername();
        //System.out.println(usernameECE);
        //String usernameCSIT = exampleCSITStudent.getUsername();
        //System.out.println(usernameCSIT);
        exampleECEStudent.printoutECEstudents();
        exampleCSITStudent.printoutCSITstudents();
        
    }
}
