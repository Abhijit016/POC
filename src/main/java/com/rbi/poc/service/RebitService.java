package com.rbi.poc.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rbi.poc.model.Zone;
import com.rbi.poc.model.Module;
import com.rbi.poc.repository.ModuleRepository;
import com.rbi.poc.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.io.*;

@Service
public class RebitService {

    @Autowired
    private ZoneRepository zoneRepository;

    @Autowired
    private ModuleRepository moduleRepository;
    
    public void saveZone(String zoneName){
        System.out.println("Inside saveZone service method");
        String zoneJson = readFile();
        Zone zoneEntity;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            zoneEntity  = objectMapper.readValue(zoneJson, Zone.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        zoneRepository.save(zoneEntity);
    }

    public void saveModule(String zoneName, String moduleName){
        System.out.println("Inside saveZone service method");
        String moduleJson = readFile();
        Module moduleEntity;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            moduleEntity  = objectMapper.readValue(moduleJson, Module.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        moduleRepository.save(moduleEntity);
    }

    public String readFile() {

        String fileName = "/home/abhijitbahuguni/Desktop/module_json.txt"; // Replace this with the path to your file
        String line = "";
        StringBuilder jsonBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            while ((line = br.readLine()) != null) {
                jsonBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonBuilder.toString();
    }
}
