/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia8ejercicio1;

import com.mycompany.guia8ejercicio1.entidades.CuentaBancaria;
import java.util.Scanner;
import com.mycompany.guia8ejercicio1.servicios.Servicios;

public class Guia8Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Bienvenido al banco de la gente");
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta1 = Servicios.crearCuenta();
        int opcion = 0;
        do {

            System.out.println("Ingrese una opcion");
            System.out.println("1 - Ingresar dinero");
            System.out.println("2 - Retirar dinero");
            System.out.println("3 - Retiro express");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Consultar datos");
            System.out.println("6 - Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Servicios.ingresoDinero(cuenta1);
                    System.out.println("El dinero ingreso correctamente");
                    break;
                case 2:
                    Servicios.retirarDinero(cuenta1);
                    break;
                case 3:
                    Servicios.extraccionRapida(cuenta1);
                    break;
                case 4:
                    Servicios.consultarSaldo(cuenta1);
                    break;
                case 5:
                    Servicios.consultarDatos(cuenta1);
                    break;
                case 6:
                    System.out.println("Ejecucion finalizada!");
                    break;
            }
        } while (opcion != 6);
    }
}
