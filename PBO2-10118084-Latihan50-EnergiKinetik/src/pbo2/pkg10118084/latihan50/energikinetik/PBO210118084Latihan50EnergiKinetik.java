/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan50.energikinetik;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menhtiung energi kinetik dan usaha

 */
public class PBO210118084Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hitungrumus hitung = new hitungrumus();
        hitung.setMassa(145);
        hitung.setKecepatan(25);
        System.out.println("Massa :"+hitung.getMassa());
        System.out.println("Kecepatan :"+hitung.getKecepatan());
        System.out.println("Energi Kinetik :"+hitung.hitungenergikinetik(hitung.getMassa(),hitung.getKecepatan())+"joule");
        System.out.println("Usaha :"+hitung.hitungusaha(hitung.getMassa(),hitung.getKecepatan())+"Joule");
    }
    
}
