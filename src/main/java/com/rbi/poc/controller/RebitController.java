package com.rbi.poc.controller;

import com.rbi.poc.model.Zone;
import com.rbi.poc.repository.ZoneRepository;
import com.rbi.poc.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/zones")
public class ZoneController {

    @Autowired
    private ZoneService zoneService;

    @PostMapping("/saveZone")
    @ResponseStatus(HttpStatus.CREATED)
    public String saveZone(@RequestBody Map<String, String> requestBody){
        String zoneName = requestBody.get("zoneName");
        System.out.println("Inside saveZone--" + zoneName);
        zoneService.saveZone(zoneName);

        return "Zone refreshed successfully";
    }

    @PostMapping("/saveModule")
    @ResponseStatus(HttpStatus.CREATED)
    public String saveModule(@RequestBody Map<String, String> requestBody){
        String moduleName = requestBody.get("moduleName");
        System.out.println("Inside saveZone--" + moduleName);
        zoneService.saveModule(moduleName);

        return "Zone refreshed successfully";
    }

//    @PostMapping("/saveZoneJson")
//    @ResponseStatus(HttpStatus.CREATED)
//    public String saveZoneJson(@RequestBody Zone zone){
//        System.out.println("Inside saveZone");
//        zoneRepository.save(zone);
//        return "Zone refreshed successfully";
//    }

//    @GetMapping("/getAllZones")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Zone> getAllZones(){
//        return zoneRepository.findAll();
//    }
}
