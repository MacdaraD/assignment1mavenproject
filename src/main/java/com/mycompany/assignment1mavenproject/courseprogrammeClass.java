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
    private static ArrayList<String> ECEstudents = new ArrayList<String>();
    private static ArrayList<String> CSITstudents = new ArrayList<String>();
    //private static moduleClass modules = new moduleClass();
    private String studentname;
    private moduleClass module;
    private LocalDate academicStartDate = new LocalDate(2018,9,1);
    private LocalDate academicEndDate = new LocalDate(2018,12,21);
    
    
    public courseprogrammeClass() {
       
    }
    public void ECE(String name, String username, int ID){
        this.studentname = name;
        String id = Integer.toString(ID);
        ECEstudents.add(studentname+" "+id);
        System.out.println(username+" "+id+" added to ECE");
        for(int i = 0;i<ECEmodules.size();i++){
           String moduleName = ECEmodules.get(i);
           
        }
    }
    public void CSIT(String name, String username, int ID){
        this.studentname=name;
        String id = Integer.toString(ID);
        CSITstudents.add(studentname+" "+id);
        System.out.println(username+" "+id+" added to CS&IT");
        for(int i = 0;i<CSITmodules.size();i++){
           String moduleName = CSITmodules.get(i);
           
        }
    }
    public void Students(){
        System.out.println("ECE students "+ECEstudents);
        System.out.println("CS&IT students "+CSITstudents);
    }
}
