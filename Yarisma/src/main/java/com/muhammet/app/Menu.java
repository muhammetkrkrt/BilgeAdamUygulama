package com.muhammet.app;

import com.muhammet.controller.KullaniciController;
import com.muhammet.controller.YarismaController;
import com.muhammet.controller.YarismaKatilimController;



import java.util.HashMap;

public class Menu {

    private KullaniciController kullaniciController;
    private YarismaController yarismaController;
    private YarismaKatilimController yarismaKatilimController;

    public Menu(){
       this.kullaniciController = new KullaniciController();
       this.yarismaController = new YarismaController();
       this.yarismaKatilimController = new YarismaKatilimController();
    }

    public void menu(){
        
        HashMap<Integer,String> menuItems = new HashMap<>();
        menuItems.put(1,"Olustuma menusu");
        menuItems.put(2,"Listeleme menusu");
       
        int key = BAUtils.menu(menuItems);

        switch (key){
            case 1:
               olusturmaMenu();
                break;
            case 2:
               listMenu();
                break;
        }
    }

    private void olusturmaMenu() {
        HashMap<Integer, String> menuItems = new HashMap<>();

        menuItems.put(1,"Kullanici ekle");
        menuItems.put(2,"Yarisma olustur");
        menuItems.put(3, "Yarismaya Katil");

        int key = BAUtils.menu(menuItems);
        switch (key) {
            case 1:
                kullaniciController.kullaniciEkle();
                break;
            case 2:
                yarismaController.yarismaOlustur();
                break;
            case 3:
                yarismaKatilimController.yarismayaKatil();

        }
    } 

    private void listMenu() {
        HashMap<Integer,String> menuItems = new HashMap<>();

        while (true){
            menuItems.put(1,"Yarismanin katilimcilari listele");
            menuItems.put(2,"Kullanicinin actigi yarismalari listele");
            menuItems.put(3, "Kullanicinin katildigi yarismalari listele");
            menuItems.put(4, "Menuye don");
            
          
            int key = BAUtils.menu(menuItems);
            switch (key){
                case 1 :
                   yarismaKatilimController.katilimcilariListele();
                    break;
                case 2:
                   kullaniciController.actigiYarismalar();
                    break;
                case 3:
                    kullaniciController.katildigiYarismalar();
                    break;
                case 4:
                    menu();
                    break;

            }
        }
    }

   
}
