/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author febrinata23
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;
        Test1 test1 = new Test1();
        test1.piramide(n);
        test1.piramideSimetri(n);
    }
    
    public void piramide(int n){
        for (int i=0;i<n+1;i++){
            for (int j=0;j<(i*2-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public  void piramideSimetri(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<(n*2-1);j++){
                if ((j<((n*2-1)/2)-i)||(j>((n*2-1)/2)+i))
                    System.out.print(" ");
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
