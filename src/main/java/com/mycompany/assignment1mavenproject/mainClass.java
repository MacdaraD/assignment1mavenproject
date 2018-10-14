/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1mavenproject;

/**
 *
 * @author MacdaraDay
 */
public class mainClass {

   
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        studentClass exampleStudent = new studentClass("Macdara Day",22,"06/10/1996","ECE");
        String username = exampleStudent.getUsername();
        System.out.println(username);
    }
}
