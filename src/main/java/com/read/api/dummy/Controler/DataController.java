package com.read.api.dummy.Controler;

import com.read.api.dummy.service.DataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {
    @Autowired
    private DataServiceImpl dataService;

    @GetMapping("/api")
    public void storeTheDetails() {
        System.out.println("Started Reaading data and saving it in table");
       dataService.storeDetails();
    }


    public void detletRecords(){

    }

}
