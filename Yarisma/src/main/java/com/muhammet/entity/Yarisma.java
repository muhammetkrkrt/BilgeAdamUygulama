/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammet.entity;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "yarismalar")
public class Yarisma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;
    private Date baslangicTarihi;
    private Date bitisTarihi;
    private String odul;
    private Integer maksimumKatilimciSayisi;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "olusturan_id", nullable = false)
    private Kullanici olusturan;

    public Yarisma() {
    }

    public Yarisma( String ad, Date baslangicTarihi, Date bitisTarihi, String odul, Integer maksimumKatilimciSayisi, Kullanici olusturan) {
        this.ad = ad;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.odul = odul;
        this.maksimumKatilimciSayisi = maksimumKatilimciSayisi;
        this.olusturan = olusturan;
    }

    @Override
    public String toString() {
        return "Yarisma{" + "id=" + id + ", ad=" + ad + ", baslangicTarihi=" + baslangicTarihi + ", bitisTarihi=" + bitisTarihi + ", odul=" + odul + ", maksimumKatilimciSayisi=" + maksimumKatilimciSayisi + ", olusturan=" + olusturan + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Date getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public void setBaslangicTarihi(Date baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }

    public Date getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(Date bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }

    public String getOdul() {
        return odul;
    }

    public void setOdul(String odul) {
        this.odul = odul;
    }

    public Integer getMaksimumKatilimciSayisi() {
        return maksimumKatilimciSayisi;
    }

    public void setMaksimumKatilimciSayisi(Integer maksimumKatilimciSayisi) {
        this.maksimumKatilimciSayisi = maksimumKatilimciSayisi;
    }

    public Kullanici getOlusturan() {
        return olusturan;
    }

    public void setOlusturan(Kullanici olusturan) {
        this.olusturan = olusturan;
    }
    
    

   
}

