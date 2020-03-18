//package com.springweb.Controller;
//
//import com.springweb.Dao.AssetDao;
//import com.springweb.Entity.Assets;
//import com.springweb.Entity.Electronics;
//import com.springweb.Service.AssetService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//
//
//import java.util.*;
//
//    @RestController
//    @RequestMapping("/asset/assets/all")
//    public class AssetController extends AssetDao {
//
//        @Autowired
//        private AssetService assetService;
//
//        @RequestMapping(method = RequestMethod.GET )
//        public Collection<Assets> getAllAsset(){
//            return assetService.getAllAssets();
//        }
//
//        @RequestMapping(value="/{id}",method = RequestMethod.GET)
//        public Assets getAssetById(@PathVariable("id") int id){
//            return  assetService.getAssetById(id);
//        }
//
//        @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
//        public void deleteAssetById(@PathVariable("id") int id){
//            assetService.removeAssetById(id);
//        }
//
////        @RequestMapping(method = RequestMethod.PUT)
////        public void updateAsset(@RequestBody Electronics electronics){
////            electronicService.updateAsset(electronics);
////        }
//
//        @RequestMapping(method = RequestMethod.POST)
//        public void addAsset(@RequestBody Electronics electronics){
//            assetService.addAsset(electronics);
//        }
//    }
//
