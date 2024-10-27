package com.mycompany.vetor02;

import java.util.Scanner;

public class Vetor02 {

    public static void main(String[] args) {
        double n[] = new double [10];
        Scanner s = new Scanner (System.in);
        for(int c=0; c<=9; c++ ){
        System.out.print("Digite a nota do " + (c + 1) + " Aluno: ");
                n[c] = s.nextDouble();
        }
        s.close();
        
       double soma = 0;
        for (int c=0; c < 9; c++){
            soma += n[c];    
    }
        double media = soma / 9;
        System.out.println("A media da sala é: " + media);
    }
}
