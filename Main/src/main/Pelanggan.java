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
public class Pelanggan {
    private String nama;
    private Penyewaan [] listpenyewaan = new Penyewaan [100];
    private int nPenyewaan = 0;
    
    public Pelanggan (String nama){
        this.nama = nama;
    }
    
    public void tambahTransaksi (long id, int n){
        Penyewaan sewa = new Penyewaan (id,n);
      listpenyewaan [nPenyewaan] = sewa;
      nPenyewaan++;
    }
    
    public Penyewaan getPenyewaan (int i){
        return listpenyewaan[i];
    }
    
    public void Display(){
        System.out.println("Nama : "+nama);
        for(int i = 0; i< nPenyewaan; i++){
            System.out.println("Nomor Penyewaan : "+listpenyewaan[i].getId());
             for(int x = 0; x < listpenyewaan[i].getnMobil();x++){
                 System.out.println(listpenyewaan[i].getMobil(x));
             }
            System.out.println("");   
        }
    }
}
