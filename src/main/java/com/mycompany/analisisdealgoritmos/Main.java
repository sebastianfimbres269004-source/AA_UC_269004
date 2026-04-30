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
        Busqueda buscador = new Busqueda();
        Ordenamientos ordenador = new Ordenamientos();
        
        int[] datosBurbuja = {64, 34, 25, 12, 22, 11, 90};
        int[] datosSeleccion = {64, 25, 12, 22, 11};
        int[] datosInsercion = {64, 34, 25, 12, 22, 11, 90};
        int[] datosQuicksort = {64, 34, 25, 12, 22, 11, 90};
        int[] datosMerge = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("--- Ordenamiento Burbuja ---");
        ordenador.burbuja(datosBurbuja);
        imprimirArray(datosBurbuja);

        System.out.println("--- Ordenamiento Selección ---");
        ordenador.seleccion(datosSeleccion);
        imprimirArray(datosSeleccion);
        
        System.out.println("--- Ordenamiento Insercion ---");
        ordenador.insercion(datosInsercion);
        imprimirArray(datosInsercion);
        
        System.out.println("--- Ordenamiento Quicksort ---");
        ordenador.quicksort(datosQuicksort);
        imprimirArray(datosQuicksort);
        
        System.out.println("--- Ordenamiento Merge Sort ---");
        ordenador.mergeSort(datosMerge);
        imprimirArray(datosMerge);
        
        System.out.println("\n--- Pruebas de Búsqueda ---");
        
        // Usaremos el arreglo de Merge Sort que ya está ordenado
        int numeroABuscar = 25; 
        
        // Búsqueda Lineal
        int posicionLineal = buscador.busquedaLineal(datosMerge, numeroABuscar);
        System.out.println("Búsqueda Lineal: El número " + numeroABuscar + " está en la posición: " + posicionLineal);

        // Búsqueda Binaria
        int posicionBinaria = buscador.busquedaBinaria(datosMerge, numeroABuscar);
        System.out.println("Búsqueda Binaria: El número " + numeroABuscar + " está en la posición: " + posicionBinaria);
    }

    public static void imprimirArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}
