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
public class identitas extends guru{
    String tanggal;
    String tempat;
    public void kelahiran(String tmp){
        tempat = tmp;
        System.out.println("Tempat lahir : "+tmp);
    }
    public void lahir(String tgl){
      tanggal = tgl;
        System.out.println("Tanggal lahir : "+tgl);
    }
    
}
