package com.mycompany.vetor01;

import java.util.Scanner;

public class Vetor01 {
    public static void main(String[] args) {
        double n[] = new double [4];
        
        Scanner s = new Scanner (System.in);
        
        for (int c=0; c<=3; c++ ){
            System.out.print("Digite a nota do " + (c + 1) + "°Bimestre: ");
                    n[c] = s.nextDouble();
        }
        s.close();
        
        double soma = 0;
        for (int c=0; c < 4; c++){
            soma += n[c];
            
        }
        double media = soma / 4;
        System.out.println("A média das notas é: " + media);
        }
}
