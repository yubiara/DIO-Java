package Loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("fatorial: ");
        int fatorial = scan.nextInt();// declaração da variavel no scan

        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");// apenas para mostrar frase
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;// guardando valores
        }
        System.out.println(multiplicacao);

    }
}
