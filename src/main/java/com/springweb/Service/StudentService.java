package com.springweb.Service;

import com.springweb.Dao.AssetDao;
import com.springweb.Entity.Assets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    @Autowired
    private AssetDao assetDao;

    public Collection<Assets> getAllAssets(){
        return assetDao.getAllAssets();
    }

    public Assets getAssetById(int id){
        return this.assetDao.getAssetById(id);
    }

    public void removeAssetById(int id) {
        assetDao.removeAssetById(id);
    }

    public void updateAsset(Assets asset) {
        assetDao.updateAsset(asset);
    }

    public void addAsset(Assets asset) {
    assetDao.addAssetToDb(asset);
    }
}
