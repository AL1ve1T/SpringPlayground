package com.aliveit.infoservice.controllers;

import com.aliveit.infoservice.model.Service;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InfoService {
    @GetMapping("/getservice")
    public List<Service> GetService(@RequestParam(name = "id") String id) {
        return new ArrayList<Service>() {
            {
                add(new Service());
            }
        };
    }
}
