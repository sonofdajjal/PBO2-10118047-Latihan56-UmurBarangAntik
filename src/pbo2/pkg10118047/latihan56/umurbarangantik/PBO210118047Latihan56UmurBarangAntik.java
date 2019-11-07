/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118047.latihan56.umurbarangantik;

/**
 *
 * @author 
 * Nama : Abdullah Margani
 * Nim : 10118047
 * Kelas: IF-2
 */
public class PBO210118047Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio radio=new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama Barang Antik : " +radio.getName());
        radio.tampilUmur();
    }
    
}
