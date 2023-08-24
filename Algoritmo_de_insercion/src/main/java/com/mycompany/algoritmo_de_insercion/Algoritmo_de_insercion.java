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
        Scanner sc = new Scanner(System.in);
        int arr[],nElementos,pos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo: "));
        arr = new  int [nElementos];
        
        System.out.println("Digite el arreglo: ");
        for (int i=0;i<nElementos;i++){
        System.out.print((i+1)+".Digite un numero: ");
        arr[i]=sc.nextInt();
        
    }
        //ordenamiento por insercion
        for (int i = 0;i<nElementos;i++){
            pos = i;
            aux=arr[i];
            
            while((pos>0)&&(arr[pos-1] > aux)){
                arr[pos]=arr[pos-1];
                pos--;
            }
            arr[pos]=aux;
        }
        System.out.print("Orden ascendente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arr[i]+" - ");
        }
        System.out.print("Orden descendente: ");
        for (int i =(nElementos-1); i>=0;i--) {
            System.out.print(arr[i]+" - ");
        }
        System.out.println("");
    }
}
