package com.springweb.Controller;

import com.springweb.Dao.ElectronicDao;
import com.springweb.Entity.Electronics;
import com.springweb.Service.ElectronicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/asset")
public class ElectronicController extends ElectronicDao {

    @Autowired
    private ElectronicService electronicService;

    @RequestMapping(value="/all",method = RequestMethod.GET )
    public Collection<Electronics> getAllStudents(){
        return electronicService.getAllAssets();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Electronics getAssetById(@PathVariable("id") int id){
        return (Electronics) electronicService.getAssetById(id);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteAssetById(@PathVariable("id") int id){
       electronicService.removeAssetById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateAsset(@RequestBody Electronics electronics){
       electronicService.updateAsset(electronics);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addAsset(@RequestBody Electronics electronics){
        electronicService.addAsset(electronics);
    }
}
