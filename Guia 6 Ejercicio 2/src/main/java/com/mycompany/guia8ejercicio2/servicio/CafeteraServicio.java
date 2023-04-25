/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia8ejercicio2.servicio;

import com.mycompany.guia8ejercicio2.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CafeteraServicio {

    public static void llenarCafetera(Cafetera cafetera) {
        cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
    }

    public static void servirTaza(Cafetera cafetera, int tamanioTaza) {

        if (cafetera.getCapacidadActual() < tamanioTaza) {
            System.out.println("No se puede llenar la taza completa, se lleno:  " + cafetera.getCapacidadActual());
            cafetera.setCapacidadActual(0);
        } else {
            System.out.println("Se lleno la taza");
            cafetera.setCapacidadActual(cafetera.getCapacidadActual() - tamanioTaza);
        }

    }

    public static void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCapacidadActual(0);
    }

    public static void agregarCafe(Cafetera cafetera) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de cafe que desea agregar: ");
        int cantidad = sc.nextInt();
        int nuevaCantidad = cafetera.getCapacidadActual() + cantidad;
        if (nuevaCantidad > cafetera.getCapacidadMaxima()) {
            System.out.println("No se puede agregar la cantidad especificada. La cafetera se llenará.");
            cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
        } else {
            cafetera.setCapacidadActual(nuevaCantidad);
        }
    }

}
