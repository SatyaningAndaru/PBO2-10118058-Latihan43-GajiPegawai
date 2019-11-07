/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan43.gajipegawai;

import java.util.Scanner;

/**
 *
 * @author user
 */
class GajiPegawai {
    private String nama,alamat;
    private int uangTransport,uangTunjangan,gajiPokok,totalGaji;
    
    Scanner input= new Scanner (System.in);
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

    public int TotalGaji(int uangTransport, int uangTunjangan, int gajiPokok) {
        this.uangTransport = uangTransport;
        this.uangTunjangan = uangTunjangan;
        this.gajiPokok = gajiPokok;
        totalGaji=(uangTransport+uangTunjangan+gajiPokok);
        return totalGaji;
    }
    
    
    public void tampilData(int uangTunjangan, int uangTransport, int gajiPokok,String nama,String alamat){
        

        
    }


   
    
    
}
