/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_de_insercion;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Alumno
 */
public class Algoritmo_de_insercion {

    public static void main(String[] args) {
        /*Creamos una varable para el scanner y ademas debemos crear una variable llamada numero de elementos
        que pregunte al usuario la cantidad de elementos pero con una ventana emergente */
        Scanner sc = new Scanner(System.in);
        int arreglo[],nElementos,pos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo: "));
        arreglo = new  int [nElementos];
        /*Asignar cuantos elementos puede tener la variable nElementos */
        
        
        System.out.println("Digite el arreglo: ");
        for (int i=0;i<nElementos;i++){
        System.out.print((i+1)+".Digite un numero: ");
        arreglo[i]=sc.nextInt();
        /*Utilizamos un bucle for para que i=0 hasta que sea menor al numero de elementos e iterar a traves de una secuencia de numeros 
         de una forma concisa para aumentar el valor de una variable en 1 en cada paso de un bucle*/
    }
        //ordenamiento por insercion
        /* añadir un itinerario para guiarnos a traves de +1 */
        for (int i = 0;i<nElementos;i++){
            pos = i;
            aux=arreglo[i];
        //añadimos 2 variables llamadas pos y aux, que sirven para ordenar y ademas para asignar el valor dentro del elemento    
            while((pos>0)&&(arreglo[pos-1] > aux)){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        //añadir un bucle while para comprobar las posiciones de los numeros menos la posicion 0 y que el iterador debe ser mayor que el numero actual
        
        System.out.print("Orden ascendente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i]+" - ");
        }
        //agregamos un bucle for que devuelva los numeros anteriormente guardados en i ademas de ordenarlos de forma ascendente
        System.out.print("\nOrden descendente: ");
        for (int i =(nElementos-1); i>=0;i--) {
            System.out.print(arreglo[i]+" - ");
        }
        //agregamos otro bucle for para que devuelva los numeros anteriomente ordenados de manera descendente
        System.out.println("");
    }
}
