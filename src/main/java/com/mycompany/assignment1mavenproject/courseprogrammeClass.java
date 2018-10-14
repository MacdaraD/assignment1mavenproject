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
    
    private ArrayList<String> ECEmodules = new ArrayList<String>(Arrays.asList("System on Chip","Software Engineering"));
    private ArrayList<String> CSITmodules = new ArrayList<String>(Arrays.asList("Software Engineering", "Web Design"));
    private ArrayList<String> ECEstudents;
    private ArrayList<String> CSITstudents;
    private String studentname;
    private LocalDate academicStartDate = new LocalDate(2018,9,1);
    private LocalDate academicEndDate = new LocalDate(2018,12,21);
    
    public courseprogrammeClass() {
       
    }
    public void ECE(String name, String username, int ID){
        this.studentname=name;
        String id = Integer.toString(ID);
        ECEstudents.add(studentname+ID);
    }
    public void CSIT(String name, String username, int ID){
        this.studentname=name;
        String id = Integer.toString(ID);
        CSITstudents.add(studentname+ID);
    }
}
