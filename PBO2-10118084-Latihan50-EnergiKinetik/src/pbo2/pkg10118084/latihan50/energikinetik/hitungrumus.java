/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan50.energikinetik;

/**
 *
 * @author Freza
 */
public class hitungrumus {
   private double massa;
   private double kecepatan;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
   public double hitungenergikinetik(double massa,double kecepatan){
   return 0.5*massa*kecepatan;
   }
   public double hitungusaha(double massa,double kecepatan){
   return (massa*10)*kecepatan*25;
   }
   
    
}
