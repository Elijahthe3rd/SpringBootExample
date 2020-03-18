//package com.springweb.Service;
//
//import com.springweb.Dao.AssetDao;
//import com.springweb.Entity.Assets;
//import com.springweb.Entity.Electronics;
//import org.springframework.beans.factory.annotation.Autowired;
//import java.util.Collection;
//
//public class AssetService {
//    @Autowired
//    private AssetDao assetDao;
//
//    public Collection<Assets> getAllAssets(){
//        return assetDao.getAllAssets();
//    }
//
//    public Assets getAssetById(int id){
//        return this.assetDao.getAssetById(id);
//    }
//
//    public void removeAssetById(int id) {
//        assetDao.removeAssetById(id);
//    }
//
////    public void updateAsset(Electronics electronics) {
////        assetDao.updateAsset(electronics);
////    }
//
//    public void addAsset(Electronics electronics) {
//        assetDao.addAssetToDb(electronics);
//    }
//}
