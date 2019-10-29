/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author WINDOWS 10
 */
public class guru {
    String namaguru;
    String matapelajaran;
    
    public void namaguru(String nama){
       this.namaguru = nama;
        System.out.println("Nama : "+nama);
    }
    public void matapelajaran(String mapel){
        this.matapelajaran = mapel;
        System.out.println("Mata pelajaran yang diajar :"+this.matapelajaran);
    }
    
}
