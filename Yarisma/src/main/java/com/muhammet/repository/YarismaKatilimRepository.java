/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammet.repository;

import com.muhammet.entity.YarismaKatilim;
import com.muhammet.utilty.MyFactoryRepository;

/**
 *
 * @author scous
 */
public class YarismaKatilimRepository extends MyFactoryRepository<YarismaKatilim,Long>{
    
    public YarismaKatilimRepository() {
        super(new YarismaKatilim());
    }
    
}
