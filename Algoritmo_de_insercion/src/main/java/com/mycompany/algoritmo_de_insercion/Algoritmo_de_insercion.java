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
        int arr[],nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo: "));
        arr = new  int [nElementos];
        
        System.out.println("Digite el arreglo: ");
        for (int i=0;i<nElementos;i++){
        System.out.println((i+1)+".Digite un numero: ");
        arr[i]=sc.nextInt();
        
    }
        //ordenamiento por insercion
    }
}
