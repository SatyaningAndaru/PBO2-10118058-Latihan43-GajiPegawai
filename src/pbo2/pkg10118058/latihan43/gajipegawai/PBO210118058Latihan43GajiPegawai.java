/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan43.gajipegawai;

/**
 *
 * @author user
 */
public class PBO210118058Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     * Nama : Satyaning Andaru BAwalaksana
     * Nim : 10118058
     * Kelas : If-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======Data Gaji Karyawan PT.KAKATU=====");
        GajiPegawai gp = new GajiPegawai();
        gp.setNama("Rizki Adam");
        gp.setAlamat("Jalan Semar dlm No 72/66");
        gp.TotalGaji(250000, 300000, 4500000);
        gp.tampilData(300000, 50000, 4500000, "", "" );
        System.out.println("###Data Gaji Karyawan PT.KAKATU###");
        System.out.println("----------------------------------");
        System.out.println("Nama Karyawan : " +gp.getNama());
        System.out.println("Alamat : "+gp.getAlamat());
        System.out.println("Uang Transport : Rp. " +gp.getUangTransport());
        System.out.println("Uang Tunjangan : Rp. " +gp.getUangTunjangan());
        System.out.println("Gaji Pokok : Rp. "+gp.getGajiPokok());
        System.out.println("TOTAL GAJI : Rp. " +gp.getTotalGaji());
    }
}
