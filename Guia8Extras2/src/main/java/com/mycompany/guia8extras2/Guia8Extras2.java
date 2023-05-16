/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia8extras2;

import com.mycompany.guia8extras2.entidades.NIF;
import com.mycompany.guia8extras2.servicios.NIFService;

/**
 *
 * @author Usuario
 */
public class Guia8Extras2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        NIF nif = NIFService.crearNif();
        NIFService.mostrar(nif);

         

    }
}
