/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammet.entity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "kullanicilar")
public class Kullanici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;
    private String soyad;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String sifre;

    @OneToMany(mappedBy = "olusturan")
    private List<Yarisma> olusturduguYarismalar;

    @OneToMany(mappedBy = "kullanici")
    private List<YarismaKatilim> katildigiYarismalar;

    
    public Kullanici() {
    }

    public Kullanici(String ad, String soyad, String email, String sifre) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.sifre = sifre;
    }
    
    

    public Kullanici( String ad, String soyad, String email, String sifre, List<Yarisma> olusturduguYarismalar, List<YarismaKatilim> katildigiYarismalar) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.sifre = sifre;
        this.olusturduguYarismalar = olusturduguYarismalar;
        this.katildigiYarismalar = katildigiYarismalar;
    }

    @Override
    public String toString() {
        return "Kullanici{" + "id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", email=" + email + ", sifre=" + sifre + ", olusturduguYarismalar=" + olusturduguYarismalar + ", katildigiYarismalar=" + katildigiYarismalar + '}';
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

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public List<Yarisma> getOlusturduguYarismalar() {
        return olusturduguYarismalar;
    }

    public void setOlusturduguYarismalar(List<Yarisma> olusturduguYarismalar) {
        this.olusturduguYarismalar = olusturduguYarismalar;
    }

    public List<YarismaKatilim> getKatildigiYarismalar() {
        return katildigiYarismalar;
    }

    public void setKatildigiYarismalar(List<YarismaKatilim> katildigiYarismalar) {
        this.katildigiYarismalar = katildigiYarismalar;
    }
    
    
    
    

    
}
