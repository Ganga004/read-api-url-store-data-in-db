package com.read.api.dummy.service;

import com.read.api.dummy.entity.DataFields;
import com.read.api.dummy.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DataServiceImpl {
    @Autowired
    DataRepository dataRepository;

    public void storeDetails() {
        RestTemplate restTemplate = new RestTemplate();
        DataFields[] dataFields = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts"
                ,DataFields[].class);
        if(dataFields!=null) {
            for (DataFields values:dataFields) {
                dataRepository.save(values);
            }
            System.out.println("Data has been saved");
        } else {
            System.out.println("Data is not available..");
        }
    }

}
