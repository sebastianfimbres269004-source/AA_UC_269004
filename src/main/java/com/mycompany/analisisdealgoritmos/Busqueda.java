/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analisisdealgoritmos;

public class Busqueda {

    // 1. Búsqueda Lineal (Busca número por número desde el inicio)
    public int busquedaLineal(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) {
                return i; // Regresa la posición donde lo encontró
            }
        }
        return -1; // Regresa -1 si no encontró el número
    }

    // 2. Búsqueda Binaria (Más rápida, pero el arreglo DEBE estar ordenado primero)
    public int busquedaBinaria(int[] arr, int objetivo) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            // Si el número está en el medio
            if (arr[medio] == objetivo) {
                return medio;
            }

            // Si el objetivo es mayor, ignoramos la mitad izquierda
            if (arr[medio] < objetivo) {
                inicio = medio + 1;
            } 
            // Si el objetivo es menor, ignoramos la mitad derecha
            else {
                fin = medio - 1;
            }
        }
        return -1; // Regresa -1 si no encontró el número
    }
}