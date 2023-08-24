/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_de_insercion;

/**
 *
 * @author Alumno
 */
public class Algoritmo_de_insercion {

    public static void main(String[] args) {
         int[] arreglo = {64, 34, 25, 12, 22, 11, 90};
        ordenarPorInsercion(arreglo);
        
        System.out.println("Arreglo ordenado:");
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }

    public static void ordenarPorInsercion(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int clave = arr[i];
            int j = i - 1;
            
            // Mover elementos del arreglo[0..i-1] que son mayores que la clave
            // a una posición adelante de su posición actual
            while (j >= 0 && arr[j] > clave) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = clave;
        }
    }
}
