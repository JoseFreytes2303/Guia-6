/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia8ejercicio2;

import com.mycompany.guia8ejercicio2.entidades.Cafetera;
import com.mycompany.guia8ejercicio2.servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia8Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        Cafetera cafe = new Cafetera();
        int opcion = 0;
        do {
            System.out.println("Bienvenido a la cafeteria DOC");
            System.out.println("Que desea realizar?");
            System.out.println("1 - Llenar la cafetera");
            System.out.println("2 - Servir en una taza");
            System.out.println("3 - Vaciar la cafetera");
            System.out.println("4 - Agregar mas cafe");
            System.out.println("5 - Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    CafeteraServicio.llenarCafetera(cafe);
                    System.out.println("La cafetera se lleno correctamente");
                    System.out.println("La capicidad " + cafe.getCapacidadActual());
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza");
                    int tamanioTaza = sc.nextInt();
                    CafeteraServicio.servirTaza(cafe, tamanioTaza);
                    System.out.println("La capacidad actual es: " + cafe.getCapacidadActual());
                    break;
                case 3:
                    CafeteraServicio.vaciarCafetera(cafe);
                    System.out.println("Se vacio la cafetera");
                    System.out.println("La capacidad es : " + cafe.getCapacidadActual());
                    break;
                case 4:
                    CafeteraServicio.agregarCafe(cafe);
                    System.out.println("Se agrego correctamente, la capacidad es: " + cafe.getCapacidadActual());
                    break;
                case 5 : 
                    System.out.println("Cafetera cerrada! ");
                    break;
                    
            }

        } while (opcion != 5);

    }
}
