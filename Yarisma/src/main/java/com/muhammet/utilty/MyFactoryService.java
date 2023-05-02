package com.muhammet.utilty;

import java.util.List;
import java.util.Optional;

public class MyFactoryService<T, R extends MyFactoryRepository> implements IServiceManager<T>{

    public R repository;
    
    public MyFactoryService(R repository){
        this.repository = repository;
    }
    
    @Override
    public void save(T t) {
        repository.save(t);
    }

    @Override
    public void update(T t) {
        repository.update(t);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<T> findAll() {
      return  repository.findAll();
    }

    @Override
    public List<T> findByAd(String ad) {
        return repository.findByAd(ad);
    }

    @Override
    public Optional<T> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<T> findByEntity(T entity) {
    return repository.findByEntity(entity);
    }
     public Optional<T> findByEmail(String mail) {
        return repository.findByEmail(mail);
    }
     
     public boolean existByEmail(String mail){
         return repository.existByEmail(mail);
     }
     
      public boolean existById(Long id){
         return repository.existById(id);
     }
      
      public List<T> findListByYarismaId(Long id){
          return repository.findListByYarismaId(id);
      }
    
}
