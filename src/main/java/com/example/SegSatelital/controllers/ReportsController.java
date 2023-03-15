package com.example.SegSatelital.controllers;

import com.example.SegSatelital.services.ReportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reports")
public class ReportsController {
    @Autowired
    private ReportsService reportsService;
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String crearReporte (@RequestBody String reporteRecibido ){

        return reportsService.createRepotrs(reporteRecibido);
    }

}
