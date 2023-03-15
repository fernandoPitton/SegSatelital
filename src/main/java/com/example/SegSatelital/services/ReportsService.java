package com.example.SegSatelital.services;

import com.example.SegSatelital.devices.Device1;
import com.example.SegSatelital.devices.Device2;
import com.example.SegSatelital.repositories.ReportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportsService {
    @Autowired
    private ReportsRepository reportsRepository;

public String createRepotrs(String report){
    String[] campos = report.split(",");
    String respuesta = null;
    switch (campos[1]){
        case "$GPRMC":
           respuesta= reportsRepository.save(Device1.crearRegistro(campos)).toString();
            break;
        case "truchini":
            respuesta =reportsRepository.save(Device2.crearRegistro(campos)).toString();
            break;


    }
    
    return respuesta;

}
}
