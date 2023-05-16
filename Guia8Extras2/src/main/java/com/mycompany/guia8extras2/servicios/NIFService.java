/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia8extras2.servicios;

import com.mycompany.guia8extras2.entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NIFService {

    static Scanner sc = new Scanner(System.in);

    public static NIF crearNif() {
        System.out.println("Ingrese su DNI: ");
        long dni = sc.nextLong();
        int resto = (int) (dni % 23);
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letra = letras[resto];
        NIF nif = new NIF(dni, letra);
        return nif;
    }

    public static void mostrar(NIF nif) {
        System.out.println(String.format("%08d", nif.getDni()) + "-" + Character.toUpperCase(nif.getLetra()));
    }

}
