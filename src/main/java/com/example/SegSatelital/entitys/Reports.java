package com.example.SegSatelital.entitys;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Reportes")
public class Reports {
    @Id
    @Column(name = "IdDispositivo")
    private Long idDispositivo;
    @Column(name = "tipoDeMensaje")
    private String tipoDeMensaje;// $GPRMC
    @Column(name = "horaUTC")
    private String horaUTC; //235959.000
    @Column(name = "estadoDeLaNavegación")
    private String estadoDeLaNavegación; //A (activo)
    @Column(name = "latitud")
    private String latitud; //3707.1333 N
    @Column(name = "longitud")
    private String longitud;// 12139.0000 W
    @Column(name = "velocidadSobreElSueloEnNudos")
    private String velocidadSobreElSueloEnNudos; //000.0
    @Column(name = "rumboSobreElSueloEnGrados")
    private String rumboSobreElSueloEnGrados; //360.0
    @Column(name = "fechaUTC")
    private String fechaUTC; //130998 (13 de septiembre de 1998)
    @Column(name = "variaciónMagnéticaEnGrados")
    private String variaciónMagnéticaEnGrados; //013.5 E
    @Column(name = "sumaDeComprobación")
    private String sumaDeComprobación;// *68

    @Column(name = "evento")
    private String evento;// report



    public Reports() {
    }

    public Reports(Long idDispositivo, String tipoDeMensaje, String horaUTC, String estadoDeLaNavegación,
                   String latitud, String longitud, String velocidadSobreElSueloEnNudos,
                   String rumboSobreElSueloEnGrados, String fechaUTC, String variaciónMagnéticaEnGrados,
                   String sumaDeComprobación) {
        this.idDispositivo = idDispositivo;
        this.tipoDeMensaje = tipoDeMensaje;
        this.horaUTC = horaUTC;
        this.estadoDeLaNavegación = estadoDeLaNavegación;
        this.latitud = latitud;
        this.longitud = longitud;
        this.velocidadSobreElSueloEnNudos = velocidadSobreElSueloEnNudos;
        this.rumboSobreElSueloEnGrados = rumboSobreElSueloEnGrados;
        this.fechaUTC = fechaUTC;
        this.variaciónMagnéticaEnGrados = variaciónMagnéticaEnGrados;
        this.sumaDeComprobación = sumaDeComprobación;
    }

    public Reports(Long idDispositivo, String tipoDeMensaje, String latitud, String longitud,
                   String velocidadSobreElSueloEnNudos, String evento) {
        this.idDispositivo = idDispositivo;
        this.tipoDeMensaje = tipoDeMensaje;
        this.latitud = latitud;
        this.longitud = longitud;
        this.velocidadSobreElSueloEnNudos = velocidadSobreElSueloEnNudos;
        this.evento = evento;
    }

    public Long getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(Long idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getTipoDeMensaje() {
        return tipoDeMensaje;
    }

    public void setTipoDeMensaje(String tipoDeMensaje) {
        this.tipoDeMensaje = tipoDeMensaje;
    }

    public String getHoraUTC() {
        return horaUTC;
    }

    public void setHoraUTC(String horaUTC) {
        this.horaUTC = horaUTC;
    }

    public String getEstadoDeLaNavegación() {
        return estadoDeLaNavegación;
    }

    public void setEstadoDeLaNavegación(String estadoDeLaNavegación) {
        this.estadoDeLaNavegación = estadoDeLaNavegación;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getVelocidadSobreElSueloEnNudos() {
        return velocidadSobreElSueloEnNudos;
    }

    public void setVelocidadSobreElSueloEnNudos(String velocidadSobreElSueloEnNudos) {
        this.velocidadSobreElSueloEnNudos = velocidadSobreElSueloEnNudos;
    }

    public String getRumboSobreElSueloEnGrados() {
        return rumboSobreElSueloEnGrados;
    }

    public void setRumboSobreElSueloEnGrados(String rumboSobreElSueloEnGrados) {
        this.rumboSobreElSueloEnGrados = rumboSobreElSueloEnGrados;
    }

    public String getFechaUTC() {
        return fechaUTC;
    }

    public void setFechaUTC(String fechaUTC) {
        this.fechaUTC = fechaUTC;
    }

    public String getVariaciónMagnéticaEnGrados() {
        return variaciónMagnéticaEnGrados;
    }

    public void setVariaciónMagnéticaEnGrados(String variaciónMagnéticaEnGrados) {
        this.variaciónMagnéticaEnGrados = variaciónMagnéticaEnGrados;
    }

    public String getSumaDeComprobación() {
        return sumaDeComprobación;
    }

    public void setSumaDeComprobación(String sumaDeComprobación) {
        this.sumaDeComprobación = sumaDeComprobación;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reports reports = (Reports) o;
        return Objects.equals(idDispositivo, reports.idDispositivo) && Objects.equals(tipoDeMensaje, reports.tipoDeMensaje) && Objects.equals(horaUTC, reports.horaUTC) && Objects.equals(estadoDeLaNavegación, reports.estadoDeLaNavegación) && Objects.equals(latitud, reports.latitud) && Objects.equals(longitud, reports.longitud) && Objects.equals(velocidadSobreElSueloEnNudos, reports.velocidadSobreElSueloEnNudos) && Objects.equals(rumboSobreElSueloEnGrados, reports.rumboSobreElSueloEnGrados) && Objects.equals(fechaUTC, reports.fechaUTC) && Objects.equals(variaciónMagnéticaEnGrados, reports.variaciónMagnéticaEnGrados) && Objects.equals(sumaDeComprobación, reports.sumaDeComprobación) && Objects.equals(evento, reports.evento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDispositivo, tipoDeMensaje, horaUTC, estadoDeLaNavegación, latitud, longitud, velocidadSobreElSueloEnNudos, rumboSobreElSueloEnGrados, fechaUTC, variaciónMagnéticaEnGrados, sumaDeComprobación, evento);
    }

    @Override
    public String toString() {
        return "Reports{" +
                "idDispositivo=" + idDispositivo +
                ", tipoDeMensaje='" + tipoDeMensaje + '\'' +
                ", horaUTC='" + horaUTC + '\'' +
                ", estadoDeLaNavegación='" + estadoDeLaNavegación + '\'' +
                ", latitud='" + latitud + '\'' +
                ", longitud='" + longitud + '\'' +
                ", velocidadSobreElSueloEnNudos='" + velocidadSobreElSueloEnNudos + '\'' +
                ", rumboSobreElSueloEnGrados='" + rumboSobreElSueloEnGrados + '\'' +
                ", fechaUTC='" + fechaUTC + '\'' +
                ", variaciónMagnéticaEnGrados='" + variaciónMagnéticaEnGrados + '\'' +
                ", sumaDeComprobación='" + sumaDeComprobación + '\'' +
                ", evento='" + evento + '\'' +
                '}';
    }
}
