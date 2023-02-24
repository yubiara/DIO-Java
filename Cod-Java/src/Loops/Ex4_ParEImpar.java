package Loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
import java.util.Scanner;

import javax.swing.JSpinner.NumberEditor;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int qttPares = 0, qttImpares = 0;// variaveis para guardar impar e pares

        System.out.println("Qual a quantidade de número? ");
        quantNumeros = scan.nextInt();// guardando a quantidade

        int count = 0;

        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                qttPares++;
            else
                qttImpares++;// conferindo pares e impares

            count++; // ou pode ser assim count = count + 1;

        } while (count < quantNumeros);

        System.out.println("Quantidade de pares: " + qttPares);
        System.out.println("Quantidade de impares: " + qttImpares);

    }
}
