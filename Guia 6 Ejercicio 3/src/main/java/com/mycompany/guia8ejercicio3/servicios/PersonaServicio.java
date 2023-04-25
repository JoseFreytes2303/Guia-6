/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia8ejercicio3.servicios;

import com.mycompany.guia8ejercicio3.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaServicio {

    static Scanner sc = new Scanner(System.in);
    //Hacemos static para llamar directamente el metodo con el nombre de la clase sin instanciar un objetol
    //lo llamamos directamente desde MAIN (pasamos parametros a trabajar, ej PERSONA;)
    public static boolean esMayorDeEdad(Persona persona) {

        return persona.getEdad() >= 18;
    }
    
    public static Persona crearPersona() {
        System.out.println("Ingrese su nombre ");
        String nombre = sc.next();
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        sc.nextLine();
        String sexo;
        boolean verif = false;
        do {
            System.out.println("Ingrese su sexo");
            sexo = sc.next();
            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("o")) {
                System.out.println("CORRECTO!");
                verif = true;
            } else {
                System.out.println("SEXO NO RECONOCIDO!");
            }
        } while (!verif);
        System.out.println("Ingrese su peso");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura");
        double altura = sc.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public static int calcularIMC(Persona persona) {
        double IMC = persona.getPeso() / (persona.getAltura() * persona.getAltura());
        int valor= 0;
        if (IMC > 20) {
            valor = -1;
        }
        if (IMC >= 20 && IMC <= 25){
            valor = 0;
        }
        if (IMC > 25){
            valor = 1;
        }    
        return valor;
    }
    


}
