/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammet.controller;

import com.muhammet.app.BAUtils;
import com.muhammet.entity.Kullanici;
import com.muhammet.entity.Yarisma;
import com.muhammet.entity.YarismaKatilim;
import com.muhammet.service.KullaniciService;
import com.muhammet.service.YarismaKatilimService;
import com.muhammet.service.YarismaService;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class YarismaKatilimController {
    
    YarismaKatilimService katilimService ;
    YarismaService yarismaService;
    KullaniciService kullaniciService;
    
    public YarismaKatilimController(){
        this.katilimService=new YarismaKatilimService();
        this.yarismaService = new YarismaService();
        this.kullaniciService = new KullaniciService();
    }
    public void yarismayaKatil(){
        String mail = BAUtils.readString("Giris yapmak icin mail adresinizi giriniz: ");
        Optional<Kullanici> optionalKullanici =kullaniciService.findByEmail(mail);
        if(optionalKullanici.isEmpty()){
            System.out.println("Boyle bir kullanici bulunamadi..");
        }else{
           Kullanici kullanici;
           String sifre = BAUtils.readString("Sifrenizi giriniz: ");
           kullanici = optionalKullanici.get();
          if(kullanici.getSifre().equals(sifre)){
             Long id = Long.valueOf(BAUtils.readString("Girmek istediginiz yarismanin Id sini giriniz: "));
             Optional<Yarisma> optionalYarisma= yarismaService.findById(id);
             if(optionalYarisma.isEmpty()){
           System.out.println("Boyle bir Id li yarisma bulunmuyor..");
       }else{
            Yarisma yarisma;
           yarisma =optionalYarisma.get();
           YarismaKatilim yarismaKatilim = new YarismaKatilim();
           yarismaKatilim.setKatilimTarihi(new Date());
           yarismaKatilim.setYarisma(yarisma);
           yarismaKatilim.setKullanici(kullanici);
           katilimService.save(yarismaKatilim);
                    
       }
          }else{
              System.out.println("Sifrenizi yanlis girdiniz...");
          }
        }
    }
    
   public void katilimcilariListele() {
       Long id = Long.valueOf(BAUtils.readString("Listelemek istediginiz yarismanin Id sini giriniz: "));
       List<YarismaKatilim> list = katilimService.findListByYarismaId(id);
       
       if(list.isEmpty()){
           System.out.println("Liste boss");
       }else{
           for (YarismaKatilim katilim : list) {
               System.out.println(katilim.getYarisma().getAd()+" Isimli yarismaya katilanlar " + katilim.getKullanici().getAd()+"   "+ katilim.getKullanici().getSoyad());
               System.out.println("");
           }
       }
    }
    
}
