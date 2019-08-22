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
public class  PenyewaanMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mobil mobil = new Mobil(10210,"lexus",3,10.000);
        Mobil mobil2 = new Mobil(10230,"fortuner",2,15.000);
         Mobil mobil3 = new Mobil(10210,"toyota",3,10.000);
        Mobil mobil4 = new Mobil(10230,"ertigas",2,15.000);
        
        Pelanggan pelanggan = new Pelanggan("wulan");
        
        
        pelanggan.tambahTransaksi(1111, 2);
        pelanggan.getPenyewaan(0).addMobil(mobil);
        pelanggan.getPenyewaan(0).addMobil(mobil2);
        
        pelanggan.tambahTransaksi(12311, 2);
        pelanggan.getPenyewaan(1).addMobil(mobil3);
        pelanggan.getPenyewaan(1).addMobil(mobil4);
        
        
        pelanggan.Display();
    }
    
}
