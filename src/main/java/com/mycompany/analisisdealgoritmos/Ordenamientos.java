package com.mycompany.analisisdealgoritmos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
}