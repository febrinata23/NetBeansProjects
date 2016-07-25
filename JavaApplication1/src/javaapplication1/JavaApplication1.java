/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author febrinata23
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "";
        showIteration(6);
        name = JOptionPane.showInputDialog("Please enter your name");
        String message = "hello "+ name +" !";
        //JOptionPane.showMessageDialog(null, message);
       ShowHaha(message);
    }
    
    public int Tambah(int x, int y){
        int hasil = x + y;
        return hasil;
    }
    
    public static void ShowHaha(String haha){
        JOptionPane.showMessageDialog(null, haha);
    }
    
    public static void showIteration(int n){
        for (int x =0;x<n;x++){
            System.out.println(x);
        }
    }
    
}
