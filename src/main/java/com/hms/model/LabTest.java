/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Tamzid
 */
public class LabTest {
   protected String title;
   protected double cost;
   protected boolean isAvailable;
   
   public LabTest(){}
           
   public LabTest(String title,double cost, boolean isAvailable) {
        this.title = title;
        this.cost = cost;
       this.isAvailable = isAvailable;
       
    }
   public String showForSearch(){
        return "Test Name: "+this.title+"\n"+
                "Cost: "+this.cost+"\n"+
                "Available: "+(this.isAvailable ? "Yes" : "No")+"\n";
    }
}
