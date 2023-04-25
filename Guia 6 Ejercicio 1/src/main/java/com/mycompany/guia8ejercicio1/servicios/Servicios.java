/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia8ejercicio1.servicios;

import com.mycompany.guia8ejercicio1.entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Servicios {
    static Scanner sc = new Scanner(System.in);

    public static CuentaBancaria crearCuenta() {
        System.out.println("Ingrese su DNI");
        long dni = sc.nextLong();
        System.out.println("Ingrese numero de cuenta");
        int cuenta = sc.nextInt();
        System.out.println("Ingrese su saldo");
        double saldo = sc.nextDouble(); 
        return  new CuentaBancaria(cuenta,dni,saldo);
    }

    public static void datosCuenta(CuentaBancaria cuenta) {
        System.out.println("Ingrese su DNI");
        cuenta.setDni(sc.nextLong());
        System.out.println("Ingrese numero de cuenta");
        cuenta.setNumeroCuenta(sc.nextInt());
        System.out.println("Ingrese su saldo");
        cuenta.setSaldoActual(sc.nextDouble());

    }

    public static void ingresoDinero(CuentaBancaria cuenta) {
        System.out.println("Ingrese la cantidad de dinero");
        double dinero = sc.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + dinero);
    }

    public static void retirarDinero(CuentaBancaria cuenta) {
        double retiro = 0;
        do {
            System.out.println("Ingrese la cantidad de dinero que desea retirar");
            retiro = sc.nextDouble();
            
            if (cuenta.getSaldoActual() > retiro) {
                cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
                System.out.println("Su saldo es de : " + cuenta.getSaldoActual());
            } else {
                System.out.println("Saldo insuficiente, su saldo es de : " + cuenta.getSaldoActual());
            }
        } while (retiro > cuenta.getSaldoActual());
    }
    
    public static void extraccionRapida(CuentaBancaria cuenta){
        System.out.println("Ingrese la cantidad de la extraccion");
        double expres = sc.nextDouble();
        if (cuenta.getSaldoActual() * 0.20 < expres){
            System.out.println("Ha ingresado un valor excedido");
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - expres);
            System.out.println("Retiro confirmado, su saldo es: " + cuenta.getSaldoActual());
        }
    }
    
    public static void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Su saldo es: " +  cuenta.getSaldoActual());  
    }
    public static void consultarDatos(CuentaBancaria cuenta){
        System.out.println("Sus datos son : " + cuenta.toString());    
    }
   
}

