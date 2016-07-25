/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author febrinata23
 */
public class Mahasiswa {
    int nim;
    String nama;

    Mahasiswa(int parseInt, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Mahasiswa(int n, String na){
        nim = n;
        nama = na;
    }
    
    public void setNim(int n){
        nim = n;
    }
    
    public void setNama(String n){
        nama = n;
    }
    
    public  int getNim(){
        return nim;
    }
    
    public String getNama(){
        return nama;
    }
}
