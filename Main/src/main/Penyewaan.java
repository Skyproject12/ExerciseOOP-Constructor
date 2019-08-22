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
public class Penyewaan {
    private long id;
    private Mobil [] listMobil;
    private int nMobil;
    

    public Penyewaan(long id, int nMobil) {
        this.id = id;
        this.nMobil = 0;
        this.listMobil = new Mobil[nMobil];
    }

    
    public long getId() {
        return id;
    }

    public int getnMobil() {
        return nMobil;
    }

    public Mobil[] getListMobil() {
        return listMobil;
    }
    
    public void addMobil (Mobil mobil){
        listMobil[nMobil] = mobil;
        nMobil++;
    }
    
     public Mobil getMobil (int i){
        return listMobil[i];
    }


}
