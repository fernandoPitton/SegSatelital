package com.example.SegSatelital.devices;

import com.example.SegSatelital.entitys.Reports;

public class Device2 {

    public static Reports crearRegistro(String[] campos){

        Reports reporte = new Reports(Long.parseLong(campos[0]), campos[1], campos[2], campos[3],
                campos[4], campos[5] );
        System.out.println(reporte);
        return reporte;
    }


}

