/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan47.nilaimahasiswa;

/**
 *
 * @author senenngahenen
 */
public class Nilai {
    private float UAS;
   private float UTS;
   private float QUIS;

   


    
    public float getUAS() {
        return UAS;
    }


    public void setUAS(float UAS) {
        this.UAS = UAS;
    }

  
    public float getUTS() {
        return UTS;
    }

 
    public void setUTS(float UTS) {
        this.UTS = UTS;
    }


    public float getQUIS() {
        return QUIS ;
    }


    public void setQUIS(float QUIS) {
        this.QUIS = QUIS;
    }

    public void NA() {
        float NA = UAS * 0.5f + UTS * 0.3f + QUIS * 0.2f;
        System.out.println("Nilai Akhir = " + NA);
    }
    
    public String IndexdanKeterangan() {

        float NA = UAS * 0.5f + UTS * 0.3f + QUIS * 0.2f;
        String Keterangan = "";
        String Index = "";
        if (NA >= 80 && NA <= 100) {
            Index = "A";
            Keterangan = "Sangat Baik";
        } else if (NA >= 68 && NA <= 80) {
            Index = "B";
            Keterangan = "Baik";
        } else if (NA >= 56 && NA <= 68) {
            Index = "C";
            Keterangan = "Cukup";
        } else if (NA >= 45 && NA <= 56) {
            Index = "D";
            Keterangan = "Kurang";
        } else {
            Index = "E";
            Keterangan = "Sangat Kurang";
        }

        System.out.println("Index = " + Index);
        System.out.println("Keterangan = " + Keterangan);
        return Keterangan;
    }

}