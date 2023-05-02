/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammet.service;

import com.muhammet.entity.Yarisma;
import com.muhammet.repository.YarismaRepository;
import com.muhammet.utilty.MyFactoryService;

/**
 *
 * @author scous
 */
public class YarismaService extends MyFactoryService<Yarisma,YarismaRepository>{
    
    public YarismaService() {
        super(new YarismaRepository());
    }
    
}
