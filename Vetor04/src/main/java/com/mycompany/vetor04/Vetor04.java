package com.mycompany.vetor04;

import java.util.Scanner;

public class Vetor04 {

    public static void main(String[] args) {
      int[] n1 = new int[8];
        int[] n2 = new int[8];
        int[] nResultado = new int[8];
        
      
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("Digite 8 números para o n1:");
        for (int c = 0; c < 8; c++) {
            System.out.print("Posição " + c + ": ");
            n1[c] = s.nextInt();
        }
        
       
        System.out.println("\nDigite 8 números para o n2:");
        for (int c = 0; c < 8; c++) {
            System.out.print("Posição " + c + ": ");
            n2[c] = s.nextInt();
        }
        
        
        for (int c = 0; c < 8; c++) {
           nResultado[c] = n1[c] * n2[c];
        }
        
        
        s.close();
        
        
        System.out.println("\nVetor Resultado (multiplicação dos elementos):");
        for (int c = 0; c < 8; c++) {
            System.out.println("Posição " + c + ": " + nResultado[c]);
        }
    }
}
    

