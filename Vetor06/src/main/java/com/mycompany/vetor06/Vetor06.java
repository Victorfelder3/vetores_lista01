package com.mycompany.vetor06;

import java.util.Scanner;

public class Vetor06 {

    public static void main(String[] args) {
  Scanner s = new Scanner(System.in);

        // Passo 1: Perguntar ao usuário quantos preços ele deseja informar
        System.out.print("Quantos preços você deseja informar? ");
        int quantidade = s.nextInt();

        // Passo 2: Criar um vetor para armazenar os preços
        double[] precos = new double[quantidade];

        // Passo 3: Solicitar os preços e armazenar no vetor
        for (int c = 0; c < quantidade; c++) {
            System.out.print("Digite o preço " + (c + 1) + ": ");
            precos[c] = s.nextDouble();
        }

        // Fechar o Scanner
        s.close();

        // Inicializar variáveis para cálculo do menor, maior e soma dos preços
        double menor = precos[0];
        double maior = precos[0];
        double soma = 0;

        // Passo 4: Calcular o menor, maior e a soma dos preços
        for (int c = 0; c < quantidade; c++) {
            if (precos[c] < menor) {
                menor = precos[c];
            }
            if (precos[c] > maior) {
                maior = precos[c];
            }
            soma += precos[c];
        }

        // Calcular a média dos preços
        double media = soma / quantidade;

        // Exibir os resultados
        System.out.println("\nResultados:");
        System.out.println("Menor preço: " + menor);
        System.out.println("Maior preço: " + maior);
        System.out.println("Média dos preços: " + media);
    }
}

