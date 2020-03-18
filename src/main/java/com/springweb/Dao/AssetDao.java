//package com.springweb.Dao;
//
//import com.springweb.Entity.Assets;
//import com.springweb.Entity.Electronics;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.UUID;
//
//public abstract class AssetDao {
//
//    private static Map<Integer, Assets> assetsDb;
//
//    static{
//        assetsDb=new HashMap<Integer, Assets>(){
//            {
//                put(1, new Assets(true,
//                        "Elijah.sepuru@umuzi.org",
//                        "Web-dev", "Good", "" ) {
//                });
//
//                put(2,new Assets(true,
//                        "Elijah.sepuru@umuzi.org",
//                        "Web-dev", "Good", "" ) {
//                });
//
//            }
//        };
//    }
//    public Collection<Assets> getAllAssets(){
//        return this.assetsDb.values();
//    }
//
//    //    get object by value
//    public Assets getAssetById(int id){
//        return this.assetsDb.get(id);
//    }
//
//    //  removes object's values or entities.
//    public void removeAssetById(int id) {
//        this.assetsDb.remove(id);
//    }
////
////    //updates asset object
////    public void updateAsset(Assets asset){
//////      created an object for
////        Assets as=this.assetsDb.get(electronica.getId());
////        as.(electronica.getId());
////        as.setSerialNo(electronica.getSerialNo());
////        as.setMake(electronica.getMake());
////        as.setType(electronica.getType());
////        as.setCondition(electronica.getStatus());
////        as.setAvailable(electronica.isAvailable());
////        as.setModel(electronica.getModel());
////        this.electronicsdb.put(electronica.getId(),asset);
////    }
//
//    public void addAssetToDb(Electronics electro) {
//        this.assetsDb.put(electro.getId(),electro);
//    }
//}
