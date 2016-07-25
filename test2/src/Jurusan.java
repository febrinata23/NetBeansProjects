/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author febrinata23
 */
public class Jurusan extends Mahasiswa{
    int kodeJurusan;
    String namaJurusan;
    String kepalaJurusan;

    public Jurusan(int parseInt, String text) {
        super(parseInt, text);
    }
    
    public void Jurusan(int kode, String na, String kep){
        kodeJurusan = kode;
        namaJurusan = na;
        kepalaJurusan = kep;
    }
    
    public int getKodeJurusan(){
        return kodeJurusan;
    }
    
    public String getNamaJurusan(){
        return namaJurusan;
    }
    
    public String getKepalaJurusan(){
        return kepalaJurusan;
    }
}
