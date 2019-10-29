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
import java.util.Scanner;
public class ujicobaguru {
    public static void main(String[] args) {
        int pilihan;
         identitas ujicobaguru = new identitas();
         Scanner in = new Scanner(System.in);
         System.out.println("Apa yang ingin anda ketahui ? ");
         System.out.println("1.Biodata guru 1 \n2.Biodata guru 2 \n3.Biodata guru 3");
         System.out.print("Masukkan pilihan anda : ");
         pilihan = in.nextInt();
         
         //pilihan 1
        if(pilihan ==1){
            System.out.println("biodata guru 1");
        ujicobaguru.namaguru("Fidiyah maharani");
        ujicobaguru.kelahiran("malang");
        ujicobaguru.lahir("29 November 2003");
        ujicobaguru.matapelajaran("Produktif");
        
         //pilihan 2
        }else if(pilihan == 2){
            System.out.println("biodata guru 2");
        ujicobaguru.namaguru("Satmika Antargata Ozora");
        ujicobaguru.kelahiran("Banyuwangi");
        ujicobaguru.lahir("29 februari 2003");
        ujicobaguru.matapelajaran("Komputer dan Jaringan Dasar");
        
        //pilihan 3
        }else if (pilihan == 3){
            System.out.println("biodata guru 3");
        ujicobaguru.namaguru("Gregorius Devon Brahmantyo");
        ujicobaguru.kelahiran("Malang");
        ujicobaguru.lahir("09 September 2004 ");
        ujicobaguru.matapelajaran("Dasar Desain Grafis");
        
        //pilihan 4
        }else if(pilihan == 4){
            System.out.println("biodata guru 4");
        ujicobaguru.namaguru("Necha Syifa Syafitri");
        ujicobaguru.kelahiran("Malang");
        ujicobaguru.lahir("28 November 2003 ");
        ujicobaguru.matapelajaran("Sistem Komputer dan Iot");
        
        // apabila pilihan tidak ditemukan
        }else{
            System.out.println("Pilihanmu tidak ditemukan!");
        }
    
    
       
        
       
        
        
       
    }
    
}
