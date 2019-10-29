/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author WINDOWS 10
 */
public class DemoOverride2 {
    public static void main(String[] args) {
        B obj = new B ();
        obj.setA(50);
        obj.SetB(150);
        //akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
    
}
