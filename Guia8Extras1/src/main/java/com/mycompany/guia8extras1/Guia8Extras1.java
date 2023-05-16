/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia8extras1;

import com.mycompany.guia8extras1.entidades.Raices;
import com.mycompany.guia8extras1.servicios.RaicesServicio;

/**
 *
 * @author Usuario
 */
public class Guia8Extras1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Raices r = new Raices(3,-3,7);
        double discriminante = RaicesServicio.getDiscriminante(r);
        boolean tieneRaices = RaicesServicio.tieneRaices(r);
        boolean tieneRaiz = RaicesServicio.tieneRaiz(r);
        System.out.println("El discriminante es: " + discriminante);
        System.out.println("Tiene Raices? " + tieneRaices);
        System.out.println("Tiene una unica raiz? " + tieneRaiz);
        RaicesServicio.calcular(r);
//        RaicesServicio.obtenerRaices(r);
//        RaicesServicio.obtenerRaiz(r);
        
        
    }
    
}
