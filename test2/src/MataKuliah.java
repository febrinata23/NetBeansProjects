/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author febrinata23
 */
public class MataKuliah extends Mahasiswa{
    int kode;
    String namaMatkul;
    int sks;

    public MataKuliah(int parseInt, String text) {
        super(parseInt, text);
    }
    
    public void MataKuliah(int ko, String na, int s){
        kode = ko;
        namaMatkul = na;
        sks = s;
    }
    
    public int getKode(){
        return kode;
    }
    
    public String getNamaMatkul(){
        return namaMatkul;
    }
    
    public int getSKS(){
        return sks;
    }
}
