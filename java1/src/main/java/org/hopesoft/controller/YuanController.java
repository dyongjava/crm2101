package org.hopesoft.controller;

import org.hopesoft.pojo.Yuan;
import org.hopesoft.service.YuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class YuanController {
    @Autowired
    private YuanService yuanservice;
    @RequestMapping("findAll")
    public List<Yuan> findAll(){
        return yuanservice.findAll();
    }
    @GetMapping("/yuan/{name}")
    public List<Yuan> getByName(@PathVariable String name){
        return yuanservice.getYuanByName(name);
    }

}
