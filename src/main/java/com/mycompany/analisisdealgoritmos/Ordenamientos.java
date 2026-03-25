/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analisisdealgoritmos;
/**
 *
 * @author sebastian
 */
/**
 * Clase que contiene los métodos de ordenamiento solicitados.
 * Siguiendo las directrices de conteo de operaciones elementales.
 */
public class Ordenamientos {

    // Algoritmo de Ordenamiento de Burbuja
    public void burbuja(int[] arr) {
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) { 
            for (int j = 0; j < n - i - 1; j++) { 
                if (arr[j] > arr[j + 1]) { 
                
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                }
            }
        }
    }
    // Algoritmo de Ordenamiento de Seleccion
    public void seleccion(int[] arr) {
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) { 
            int min_idx = i; 
            for (int j = i + 1; j < n; j++) { 
                if (arr[j] < arr[min_idx]) { 
                    min_idx = j; 
                }
            }
            // Swap
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    
        // Algoritmo de Ordenamiento por Inserción
    public void insercion(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }   
    
    // Algoritmo de Ordenamiento Quicksort
    public void quicksort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quicksortRecursivo(arr, 0, arr.length - 1);
    }
    
    private void quicksortRecursivo(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            // Encuentra el índice de partición (el pivote queda en su lugar correcto)
            int indiceParticion = particion(arr, inicio, fin);

            // Ordena la mitad izquierda antes del pivote
            quicksortRecursivo(arr, inicio, indiceParticion - 1);
            // Ordena la mitad derecha después del pivote
            quicksortRecursivo(arr, indiceParticion + 1, fin);
        }
    }

    private int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin]; // Elegimos el último número como pivote
        int i = (inicio - 1);  // Índice del elemento más pequeño

        for (int j = inicio; j < fin; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (arr[j] <= pivote) {
                i++;
                // Intercambiamos arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;

        return i + 1; // Regresamos la posición final del pivote
    }
}