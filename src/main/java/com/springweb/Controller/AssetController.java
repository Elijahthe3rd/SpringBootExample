package com.springweb.Controller;

import com.springweb.Entity.Assets;
import com.springweb.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.*;

@RestController
@RequestMapping("/students")
public class AssetController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET )
    public Collection<Assets> getAllStudents(){
        return studentService.getAllAssets();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Assets getStudentById(@PathVariable("id") int id){
        return studentService.getAssetById(id);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id){
       studentService.removeAssetById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateAsset(@RequestBody Assets asset){
       studentService.updateAsset(asset);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addAsset(@RequestBody Assets asset){
        studentService.addAsset(asset);
    }
}
