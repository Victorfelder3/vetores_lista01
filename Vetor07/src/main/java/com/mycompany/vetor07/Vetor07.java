package com.mycompany.vetor07;

import java.util.Scanner;
import java.util.Random;
public class Vetor07 {

    public static void main(String[] args) {
           int[] numeros = new int[50];
        
       
        Random r = new Random();
        
        
        for (int c = 0; c < 50; c++) {
            numeros[c] = r.nextInt(100) + 1; // Gera números entre 1 e 100
        }
        
        // Criar um Scanner para ler a entrada do usuário
        Scanner s = new Scanner(System.in);

        // Passo 3: Solicitar um número ao usuário
        System.out.print("Digite um número para verificar se está presente no vetor: ");
        int numeroUsuario = s.nextInt();

        // Fechar o Scanner
        s.close();

        // Passo 4: Verificar se o número está presente no vetor
        boolean encontrado = false;
        for (int c = 0; c < 50; c++) {
            if (numeros[c] == numeroUsuario) {
                encontrado = true;
                break;
            }
        }

        // Exibir o resultado
        if (encontrado) {
            System.out.println("Está Presente");
        } else {
            System.out.println("Não está presente");
        }
    }
}