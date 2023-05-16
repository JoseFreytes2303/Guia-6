/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia8extras3.servicios;

import com.mycompany.guia8extras3.entidades.Autobus;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioAutobus {

    static Scanner sc = new Scanner(System.in);

    public static Autobus crearAutobus() {
        System.out.println("Ingrese la cantidad maxima del autobus");
        int cantidadMaxima = sc.nextInt();
        System.out.println("Ingrese la cantidad actual de pasajeros");
        int pasajerosActual = sc.nextInt();
        System.out.println("Ingrese la cantidad de paradas");
        int cantidadParadas = sc.nextInt();
        System.out.println("Ingrese su identifiacion");
        int identificacion = sc.nextInt();
        Autobus autobus = new Autobus(cantidadMaxima, pasajerosActual, cantidadParadas, identificacion);
        return autobus;
    }

    public static void inicioRecorrido(Autobus autobus, int cantidad) {
        if (cantidad <= autobus.getCapacidaMaxima()) {
            autobus.setPasajerosActual(cantidad);
            System.out.println("El inicio del recorrido de pasajeros es: " + cantidad);

        } else {
            System.out.println("La cantidad de pasajeros ha superado la cantidad maxima!");
        }
    }

    public static void finRecorrido(Autobus autobus) {
        autobus.setPasajerosActual(0);
        System.out.println("FIn del recorrido!");
    }

    public static void subirPasajeros(Autobus autobus, int cantidad, int parada) {
        int capacidadActual = autobus.getPasajerosActual();
        int capacidadMaxima = autobus.getCapacidaMaxima();
        int primeraParada = 1;
        int ultimaParada = autobus.getCantidadParadas();

        if (parada == primeraParada) {
            inicioRecorrido(autobus, cantidad);
        } else if (parada == ultimaParada) {
            System.out.println("Fin del recorrido. No pueden subir mas pasajeros");
        } else {
            if (capacidadActual == capacidadMaxima) {
                System.out.println("No se pueden subir mas pasajeros. El autobus esta lleno.");
            } else if (capacidadActual + cantidad > capacidadMaxima) {
                int disponibles = capacidadMaxima - capacidadActual;
                System.out.println("Solo se pueden subir " + disponibles + " pasajeros en la parada " + parada);
                autobus.setPasajerosActual(capacidadMaxima);
                autobus.setCantidadParadas(parada);
            } else {
                autobus.setPasajerosActual(capacidadActual + cantidad);
                autobus.setCantidadParadas(parada);
                System.out.println("Se han subido " + cantidad + " pasajeros en la parada " + parada);
            }
        }
    }

    public static void bajarPasajeros(Autobus autobus, int cantidad, int parada) {
        if (parada == 1) {
            System.out.println("El autobús aún se encuentra vacío.");
        } else if (parada == autobus.getCantidadParadas()) {
            ServicioAutobus.finRecorrido(autobus);
        } else {
            int capacidadActual = autobus.getPasajerosActual();
            if (cantidad <= capacidadActual) {
                autobus.setPasajerosActual(capacidadActual - cantidad);
                System.out.println(cantidad + " pasajero(s) ha(n) bajado del autobús en la parada " + parada);
            } else {
                System.out.println("No pueden bajarse más pasajeros de los que hay en el autobús en la parada " + parada);
            }
        }
    }    
}
