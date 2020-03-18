package com.springweb.Dao;

import com.springweb.Entity.Assets;
import com.springweb.Entity.Electronics;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.HashMap;

import java.util.*;

@Repository
public abstract class ElectronicDao {

    private static Map<Integer, Electronics> electronicsdb;

    static{
        electronicsdb=new HashMap<Integer, Electronics>(){
            {
                put(1,new Electronics(1, UUID.randomUUID(),
                        "lenovo",
                        "Electronic","Good",true,"superMulti"));

                put(2,new Electronics(2, UUID.randomUUID(),
                        "LG",
                        "Electronic","Good",true,"superMulti"));
                put(3,new Electronics(3, UUID.randomUUID(),
                        "SAMA",
                        "Electronic","Broken",false,"superMulti"));
            }
        };
    }
    public Collection<Electronics> getAllAssets(){
        return this.electronicsdb.values();
    }

//    get object by value
    public Electronics getAssetById(int id){
        return this.electronicsdb.get(id);
    }

//  removes object's values or entities.
    public void removeAssetById(int id) {
        this.electronicsdb.remove(id);
    }

    //updates asset object
    public void updateAsset(Electronics electro){
//      created an object for
        Electronics as=this.electronicsdb.get(electro.getId());
        as.setId(electro.getId());
        as.setSerialNo(electro.getSerialNo());
        as.setMake(electro.getMake());
        as.setType(electro.getType());
        as.setCondition(electro.getStatus());
        as.setAvailable(electro.isAvailable());
        as.setModel(electro.getModel());
        this.electronicsdb.put(electro.getId(),electro);
    }

    public void addAssetToDb(Electronics electro) {
        this.electronicsdb.put(electro.getId(),electro);
    }
}
