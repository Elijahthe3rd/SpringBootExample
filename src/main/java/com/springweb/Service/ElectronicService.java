package com.springweb.Service;

import com.springweb.Dao.ElectronicDao;
import com.springweb.Entity.Assets;
import com.springweb.Entity.Electronics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ElectronicService {
    @Autowired
    private ElectronicDao electronicDao;

    public Collection<Electronics> getAllAssets(){
        return electronicDao.getAllAssets();
    }

    public Assets getAssetById(int id){
        return this.electronicDao.getAssetById(id);
    }

    public void removeAssetById(int id) {
        electronicDao.removeAssetById(id);
    }

    public void updateAsset(Electronics electronics) {
        electronicDao.updateAsset(electronics);
    }

    public void addAsset(Electronics electronics) {
    electronicDao.addAssetToDb(electronics);
    }
}
