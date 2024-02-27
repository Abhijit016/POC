package com.rbi.poc.controller;

import com.rbi.poc.model.Module;
import com.rbi.poc.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/modules")
public class ModuleController {

    @Autowired
    private ModuleRepository moduleRepository;
    @PostMapping("/saveModule")
    public String saveModule(@RequestBody Module module){
        moduleRepository.save(module);
        return "Module saved successfully";
    }
}
