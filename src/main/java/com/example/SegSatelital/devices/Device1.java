package com.example.SegSatelital.devices;

import com.example.SegSatelital.entitys.Reports;


public class Device1 {




    public static Reports crearRegistro(String[] campos){

        String[] campos2 = campos[12].split("\\*");

        Reports reporte = new Reports(Long.parseLong(campos[0]), campos[1], campos[2], campos[3],
                campos[4] + campos[5], campos[6] + campos[7], campos[8], campos[9],
                campos[10], campos[11] + campos2[0],
                "*" + campos2[1]);
        System.out.println(reporte);
        return reporte;
    }


}
