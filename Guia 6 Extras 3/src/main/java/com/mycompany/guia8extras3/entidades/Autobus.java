/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia8extras3.entidades;

/**
 *
 * @author Usuario
 */
public class Autobus {
    private int capacidaMaxima;
    private int pasajerosActual;
    private int cantidadParadas;
    private int identificacion;

    public Autobus() {
    }

    public Autobus(int capacidaMaxima, int pasajerosActual, int cantidadParadas, int identificacion) {
        this.capacidaMaxima = capacidaMaxima;
        this.pasajerosActual = pasajerosActual;
        this.cantidadParadas = cantidadParadas;
        this.identificacion = identificacion;
    }

    public int getCapacidaMaxima() {
        return capacidaMaxima;
    }

    public void setCapacidaMaxima(int capacidaMaxima) {
        this.capacidaMaxima = capacidaMaxima;
    }

    public int getPasajerosActual() {
        return pasajerosActual;
    }

    public void setPasajerosActual(int pasajerosActual) {
        this.pasajerosActual = pasajerosActual;
    }

    public int getCantidadParadas() {
        return cantidadParadas;
    }

    public void setCantidadParadas(int cantidadParadas) {
        this.cantidadParadas = cantidadParadas;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

 

   
    
}
