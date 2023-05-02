/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammet.controller;

import com.muhammet.app.BAUtils;
import com.muhammet.entity.Kullanici;
import com.muhammet.service.KullaniciService;
import java.util.List;


public class KullaniciController {

  
    KullaniciService kullaniciService;
    
    public KullaniciController(){
        this.kullaniciService = new KullaniciService();
    }

    public void kullaniciEkle(){
        Kullanici kullanici = new Kullanici( BAUtils.readString("Lutfen isminizi giriniz: "),
                BAUtils.readString("Lutfen soyisminiz giriniz: "), 
                BAUtils.readString("Lutfen mail adresinizi giriniz: "), 
                BAUtils.readString("Lutfen sifrenizi giriniz: "));
        kullaniciService.save(kullanici);
    }
    
      public void actigiYarismalar() {
          String ad = BAUtils.readString("Kullanicinin ismini giriniz: ");
          List<Kullanici> kullaniciList = kullaniciService.findByAd(ad);
          if(kullaniciList != null){
              for (Kullanici kullanici : kullaniciList) {
               kullanici.getOlusturduguYarismalar().forEach(System.out::println);
          }
          }else{
              System.out.println("Boyle bir kullanici yok.");
          }
    
      }

    public void katildigiYarismalar() {

         String ad = BAUtils.readString("Kullanicinin ismini giriniz: ");
          List<Kullanici> kullaniciList = kullaniciService.findByAd(ad);
          if(kullaniciList != null){
              for (Kullanici kullanici : kullaniciList) {
                  System.out.println(kullanici.getKatildigiYarismalar());
          }
          }else{
              System.out.println("Boyle bir kullanici yok.");
          }
    }
}
