package com.mycompany.vetor03;

import java.util.Scanner;

public class Vetor03 {

    public static void main(String[] args) {
         String[] nomes = new String[5];
         Scanner s = new Scanner(System.in);
         for (int c = 0; c < 5; c++) {
            System.out.print("Digite o " + (c + 1) + "º nome: ");
            nomes[c] = s.nextLine();
        }
         s.close();
         
         System.out.println("\nNomes informados:");
         for(int c = 0; c < 5; c++){
             System.out.println(nomes[c]);
         }
    }
}
