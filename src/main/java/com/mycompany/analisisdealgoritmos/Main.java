/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.analisisdealgoritmos;

/**
 *
 * @author sebastian
 */
public class Main {
    public static void main(String[] args) {
        Ordenamientos ordenador = new Ordenamientos();
        
        int[] datosBurbuja = {64, 34, 25, 12, 22, 11, 90};
        int[] datosSeleccion = {64, 25, 12, 22, 11};

        System.out.println("--- Ordenamiento Burbuja ---");
        ordenador.burbuja(datosBurbuja);
        imprimirArray(datosBurbuja);

        System.out.println("\n--- Ordenamiento Selección ---");
        ordenador.seleccion(datosSeleccion);
        imprimirArray(datosSeleccion);
    }

    public static void imprimirArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}
