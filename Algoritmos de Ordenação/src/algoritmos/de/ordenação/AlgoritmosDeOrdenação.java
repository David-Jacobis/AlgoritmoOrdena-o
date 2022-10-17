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
public class AlgoritmosDeOrdenação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random gerador = new Random();
        int[] ListaA = new int[20];
        int[] ListaB = new int[20000];
       
        // Método Sort
        for (int i = 0; i < ListaA.length; i++) {
            ListaA[i] = gerador.nextInt(100);
            System.out.println("20 Números: "+ ListaA[i]);
                 }
                int i, key, j; 
                for (i = 1; i < ListaA.length; i++){ 
                key = ListaA[i]; 
                j = i - 1; 
  
            while (j >= 0 && ListaA[j] > key){ 
            ListaA[j + 1] = ListaA[j]; 
            j = j - 1; 
            }    
            ListaA[j + 1] = key;  
            
            }
            for (int x = 0; x < ListaA.length; x++) {
            System.out.println("20 Números Modificados: "+ ListaA[x]);
                 }   
               
            // Com 20000 Números
            for (int z = 0; z <ListaB.length; z++) {
            ListaB[z] = gerador.nextInt(100);
            System.out.println("20000 Números: "+ ListaB[z]);
            }
            int y, key2, w; 
                for (y = 1; y < ListaB.length; y++){ 
                key2 = ListaB[y]; 
                w = y - 1; 
  
            while (w >= 0 && ListaB[w] > key2){ 
            ListaB[w + 1] = ListaB[w]; 
            w = w - 1; 
            }    
            ListaB[w + 1] = key2;  
            
            }
            for (int x = 0; x < ListaB.length; x++) {
            System.out.println("20000 Números Modificados: "+ ListaB[x]);
                 }
    }
                
}
        
        
       
    

