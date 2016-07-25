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
public class MyFirstApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hallo world");
        
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.SMALL;
        System.out.println("size: " + juice.size);
        
        Employee emp = new Employee("Kaziz");
        emp.age = 10;
        emp.designation = "lalala";
        emp.salary = 100000;
        
        emp.printEmp();
        
        int a , b, c;
        //System.out.println(a);
    }
    
}

class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM, LARGER}
    FreshJuiceSize size;
}