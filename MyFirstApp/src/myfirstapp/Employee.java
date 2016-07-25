/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapp;

/**
 *
 * @author febrinata23
 */
public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    
    //contructor
    public Employee(String name){
        this.name = name;
    }
    
    public void empAge(int age){
        this.age = age;
    }
    
    public void empDesign(String desig){
        designation = desig;
    }
    
    public void empSalary(double salary){
        this.salary=salary;
    }
    
    public void printEmp(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Design :"+designation);
        System.out.println("Salary :"+salary);
    }
    
}
