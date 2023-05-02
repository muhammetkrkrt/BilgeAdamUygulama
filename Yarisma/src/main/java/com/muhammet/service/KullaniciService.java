/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammet.service;

import com.muhammet.entity.Kullanici;
import com.muhammet.repository.KullaniciRepository;
import com.muhammet.utilty.MyFactoryService;

/**
 *
 * @author scous
 */
public class KullaniciService extends MyFactoryService<Kullanici,KullaniciRepository>{
    
    public KullaniciService() {
        super(new KullaniciRepository());
    }
    
}
