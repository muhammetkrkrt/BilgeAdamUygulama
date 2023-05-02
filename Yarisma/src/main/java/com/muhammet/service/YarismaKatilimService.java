/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammet.service;

import com.muhammet.entity.YarismaKatilim;
import com.muhammet.repository.YarismaKatilimRepository;
import com.muhammet.utilty.MyFactoryService;

/**
 *
 * @author scous
 */
public class YarismaKatilimService extends MyFactoryService<YarismaKatilim,YarismaKatilimRepository>{
    
    public YarismaKatilimService() {
        super(new YarismaKatilimRepository());
    }
    
}
