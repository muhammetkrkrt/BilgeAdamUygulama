/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammet.controller;

import com.muhammet.app.BAUtils;
import com.muhammet.entity.Kullanici;
import com.muhammet.entity.Yarisma;
import com.muhammet.service.KullaniciService;
import com.muhammet.service.YarismaService;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class YarismaController {
    
    YarismaService yarismaService;
    KullaniciService kullaniciService;
    
    public YarismaController(){
        this.yarismaService = new YarismaService();
        this.kullaniciService = new KullaniciService();
    }
    
    public void yarismaOlustur(){
       String email = BAUtils.readString("Mail adresinizi giriniz: ");
       boolean check =kullaniciService.existByEmail(email);
       if(check = false){
           System.out.println("Boyle bir mail adresli kullanici bulunamadi..");
       }else{
           Optional<Kullanici> optionalKullanici= kullaniciService.findByEmail(email);
           Kullanici kullanici;
           String sifre = BAUtils.readString("Sifrenizi giriniz: ");
           kullanici = optionalKullanici.get();
          if(kullanici.getSifre().equals(sifre)){
              Yarisma yarisma = new Yarisma();
              yarisma.setAd(BAUtils.readString("Yarismaninizin ismini giriniz: "));
              yarisma.setOlusturan(kullanici);
              String dateBaString = BAUtils.readString("Yarismanin Baslangic tarihini (dd-MM-yyyy) bu formatta giriniz: ");
              DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
              String dateBiString = BAUtils.readString("Yarismanin Bitis tarihini (dd-MM-yyyy) bu formatta giriniz: ");
              Date dateBa = null;
              Date dateBi = null;
               try {
                   dateBa = dateFormat.parse(dateBaString);
                   dateBi = dateFormat.parse(dateBiString);
               } catch (ParseException ex) {
                   Logger.getLogger(YarismaController.class.getName()).log(Level.SEVERE, null, ex);
               }
              yarisma.setBaslangicTarihi(dateBa);
              yarisma.setBitisTarihi(dateBi);
              yarisma.setMaksimumKatilimciSayisi(BAUtils.readInt("Maksimum katilimci sayisini giriniz: "));
              yarisma.setOdul(BAUtils.readString("Verilecek Odulu giriniz: "));
              yarismaService.save(yarisma);
              System.out.println("Yarisma basari ile olusturuldu..");
          }else{
              System.out.println("Sifrenizi hatali girdiniz..");
          }
       }
        
    }

   
    
}
