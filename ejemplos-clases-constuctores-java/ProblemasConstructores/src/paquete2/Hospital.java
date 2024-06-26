/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Hospital {

    private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;

    public Hospital(String a, String b,
            int c, int d) {
        nombre = a;
        ciudad = b;
        numeroDoctores = c;
        numeroEnfermeros = d;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public void establecerNumeroDoctores(int n) {
        numeroDoctores = n;
    }

    public void establecerNumeroEnfermeros(int n) {
        numeroEnfermeros = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroDoctores() {
        return numeroDoctores;
    }

    public int obtenerNumeroEnfermeros() {
        return numeroEnfermeros;
    }

    @Override
    public String toString() {
        // String cadena = String.format("%s \n", nombre);
        String cadena = String.format("Nombre: %s"
                + "\nCiudad: %s"
                + "\nNumero de Doctores: %d"
                + "\nNumero de Enfermeros: %d\n",
                obtenerNombre(),
                obtenerCiudad(),
                obtenerNumeroDoctores(),
                obtenerNumeroEnfermeros());
        return cadena;
    }

}
