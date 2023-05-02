/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammet.entity;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "yarisma_katilimcilar")
public class YarismaKatilim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "yarisma_id", nullable = false)
    private Yarisma yarisma;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kullanici_id", nullable = false)
    private Kullanici kullanici;

    @Column(nullable = false)
    private Date katilimTarihi;

    public YarismaKatilim() {
    }

    public YarismaKatilim( Yarisma yarisma, Kullanici kullanici, Date katilimTarihi) {
        this.yarisma = yarisma;
        this.kullanici = kullanici;
        this.katilimTarihi = katilimTarihi;
    }

    @Override
    public String toString() {
        return "YarismaKatilim{" + "id=" + id + ", yarisma=" + yarisma + ", kullanici=" + kullanici + ", katilimTarihi=" + katilimTarihi + '}';
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Yarisma getYarisma() {
        return yarisma;
    }

    public void setYarisma(Yarisma yarisma) {
        this.yarisma = yarisma;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public Date getKatilimTarihi() {
        return katilimTarihi;
    }

    public void setKatilimTarihi(Date katilimTarihi) {
        this.katilimTarihi = katilimTarihi;
    }

  
}

