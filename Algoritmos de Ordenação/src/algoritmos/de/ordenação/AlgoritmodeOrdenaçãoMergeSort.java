/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.de.ordenação;

import java.util.Random;

/**
 *
 * @author 12011714
 */
public class AlgoritmodeOrdenaçãoMergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random gerador = new Random();
        int[] ListaA = new int[20];
        int[] ListaB = new int[20000];
        
        for (int i = 0; i < ListaA.length; i++) {
            ListaA[i] = gerador.nextInt(100);
            System.out.println("20 Números: "+ ListaA[i]);
            }
        for (int i = 0; i < ListaA.length; i++) {
            ListaB[i] = gerador.nextInt(100);
            System.out.println("20000 Números: "+ ListaB[i]);
            }
        mergeSort(ListaA, ListaA.length);
        mergeSort(ListaB, ListaB.length);
        
        for (int i = 0; i < 10; i++) {
          System.out.println("20000 Números: "+ ListaA[i]);  
        }
        for (int i = 0; i < 10; i++) {
          System.out.println("20000 Números Modificados: "+ ListaB[i]);
        }
    }
    
    public static void mergeSort(int[] a, int n) {
    if (n < 2) {
        return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);

    merge(a, l, r, mid, n - mid);
}
    
    public static void merge(
  int[] a, int[] l, int[] r, int left, int right) {
 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
}
    
}
