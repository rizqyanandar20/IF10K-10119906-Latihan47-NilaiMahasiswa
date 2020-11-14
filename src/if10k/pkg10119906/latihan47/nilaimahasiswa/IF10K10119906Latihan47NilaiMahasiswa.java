/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan47.nilaimahasiswa;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class IF10K10119906Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai();
        nilai.setQUIS(60.0f);
        nilai.setUTS(80.0f);
        nilai.setUAS(75.0f);
        

        System.out.println("QUIZ = " + nilai.getQUIS());
        System.out.println("UTS  = " + nilai.getUTS());
        System.out.println("UAS  = " + nilai.getUAS());
        System.out.println("");
        nilai.NA();
        System.out.println("");
        nilai.IndexdanKeterangan();
    }
}
