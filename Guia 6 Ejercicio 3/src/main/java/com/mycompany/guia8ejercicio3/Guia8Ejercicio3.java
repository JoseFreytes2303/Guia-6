/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia8ejercicio3;

import com.mycompany.guia8ejercicio3.entidades.Persona;
import com.mycompany.guia8ejercicio3.servicios.PersonaServicio;

/**
 *
 * @author Usuario
 */
public class Guia8Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Persona[] personas = new Persona[4];
        int [] IMC = new int[4];
        boolean [] edad = new boolean [4];
        for (int i = 0; i < personas.length; i++) {
            personas[i] = PersonaServicio.crearPersona();
        }
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].toString());
            if (PersonaServicio.esMayorDeEdad(personas[i])){
                System.out.println(personas[i].getNombre() +  " es mayor de edad");
            } else
                System.out.println(personas[i].getNombre() + " es menor de edad");
            switch (PersonaServicio.calcularIMC(personas[i])){
                case 1 :
                    System.out.println(personas[i].getNombre() + " tiene sobrepeso");
                    break;
                case 0 :
                    System.out.println(personas[i].getNombre() + "tiene peso ideal");
                    break;
                case -1 :
                    System.out.println(personas[i].getNombre() + "esta por debajo del peso ideal");
                    break;
            }
        }
        int mayor= 0 , menor= 0, bajo = 0;
            int igual = 0, sobre =0 ;
        for (int i = 0; i < IMC.length; i++) {
            
            IMC[i] = PersonaServicio.calcularIMC(personas[i]);
            edad[i] = PersonaServicio.esMayorDeEdad(personas[i]);
            if (edad[i] == true){
                mayor ++;
            } else {
                menor ++;
            }
            if (IMC[i]== 1 ){
                sobre++;
            } 
            if (IMC[i]== 0){
                igual++;
            }
            if (IMC[i]== -1){
                bajo++;
            }                                                            
            
            
        }
        System.out.println("El porcentaje de personas mayores es: " + mayor * 100 / 4);
            System.out.println("El porcentaje de personas mayores es: " + menor * 100 / 4);
            System.out.println("El porcentaje de personas con sobrepeso es : " + sobre * 100 / 4  );
            System.out.println("El porcentaje de personas con peso ideal es : " + igual * 100 / 4  );
            System.out.println("El porcentaje de personas con poco peso es : " + bajo * 100 / 4  );

        //Persona p2 = PersonaServicio.crearPersona();
        //System.out.println(PersonaServicio.esMayorDeEdad(p2));
        //System.out.println(PersonaServicio.calcularIMC(p2));
        //Persona p1 = new Persona();
        //p1.setEdad(17);
        //System.out.println(PersonaServicio.esMayorDeEdad(p1));
    }
}
