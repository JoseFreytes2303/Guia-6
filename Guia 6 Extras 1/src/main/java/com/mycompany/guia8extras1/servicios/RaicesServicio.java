/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia8extras1.servicios;

import com.mycompany.guia8extras1.entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RaicesServicio {

    static Scanner sc = new Scanner(System.in);

    //Calculamos siguiendo la formula, con los valores que le vamos asignar a las variables "A""B""C"
    
    public static double getDiscriminante(Raices r) {
        return Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
    }
    
    //LLamamos al metodo getDiscriminante si la formula es igual o mayor a 0 tiene soluciones
    // hace falta crear una variable para asignarle el valor de la ecuacion del metodo anterior
    // y devolvemos true o false dependiendo del resultado

    public static boolean tieneRaices(Raices r) {
        double discriminante = getDiscriminante(r);
        return discriminante >= 0;
    }
    //Traemos el metodo getDiscriminante si el resultado de esta cuenta es 0 tiene una sola solucion real
    // Retornamos el booleano

    public static boolean tieneRaiz(Raices r) {
        double discriminate = getDiscriminante(r);
        return discriminate == 0;
    }
    //Si el 

    public static void obtenerRaices(Raices r) {
        if (tieneRaices(r)) {
            double x1 = (-r.getB() + Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            double x2 = (-r.getB() - Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            System.out.println("Las posibles soluciones son: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    public static void obtenerRaiz(Raices r) {
        if (tieneRaiz(r)) {
            double x = -r.getB() / (2 * r.getA());
            System.out.println("La única solución posible es: x = " + x);
        } else {
            System.out.println("La ecuación no tiene una única solución.");
        }
    }

    public static void calcular(Raices r) {
        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}
