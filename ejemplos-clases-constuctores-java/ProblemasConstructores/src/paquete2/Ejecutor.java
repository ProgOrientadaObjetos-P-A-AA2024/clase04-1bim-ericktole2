/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String ciudad;
        int numD;
        int numE;

        System.out.println("Ingrese el nombre del Hospital");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la ciudad del Hospital");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la cantidad de doctores");
        numD = entrada.nextInt();
        System.out.println("Ingrese la cantidad de enfermeros");
        numE = entrada.nextInt();

        Hospital h1 = new Hospital(nombre, ciudad, numD, numE);
        
        entrada.nextLine();
        
        System.out.printf("%s\n",
                h1.toString());

        System.out.println("Ingrese el nombre del Hospital");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la ciudad del Hospital");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la cantidad de doctores");
        numD = entrada.nextInt();
        System.out.println("Ingrese la cantidad de enfermeros");
        numE = entrada.nextInt();
        Hospital h2 = new Hospital(nombre, ciudad, numD, numE);

        System.out.printf("%s\n",
                h2.toString());

    }
}