
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Praktikan
 */
public class Mobil {
    private long id;
    private String nama_merk;
    private int jumlah;
    private double harga;


    public Mobil(long id, String nama_merk, int jumlah, double harga) {
        this.id = id;
        this.nama_merk = nama_merk;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama_merk() {
        return nama_merk;
    }

    public void setNama_merk(String nama_merk) {
        this.nama_merk = nama_merk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return  "Mobil " + nama_merk + " sebanyak " + jumlah;
    }
    
    
    
}
