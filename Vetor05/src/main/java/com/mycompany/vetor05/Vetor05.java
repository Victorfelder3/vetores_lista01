package com.mycompany.vetor05;

import java.util.Scanner;

public class Vetor05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Quantas frutas você deseja informar? ");
        int quantidade = s.nextInt();

        s.nextLine();

        String[] frutas = new String[quantidade];

        for (int c = 0; c < quantidade; c++) {
            System.out.print("Digite o nome da fruta " + (c + 1) + ": ");
            frutas[c] = s.nextLine();
        }

        s.close();

        System.out.println("\nFrutas informadas e quantidade de letras:");
        for (int c = 0; c < quantidade; c++) {
            System.out.println(frutas[c] + " - " + frutas[c].length() + " letras");
        }
    }
}
