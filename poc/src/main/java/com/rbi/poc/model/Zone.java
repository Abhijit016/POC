package com.rbi.poc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class Zone {

    @Id
    private Integer id;
    private  String name;

    @JsonProperty("modules")
    List<Module> modules = new ArrayList<>();

    private String mobile;

    public Integer getId() {
        return id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
