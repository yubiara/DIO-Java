package Loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;// soma para fazer a média dos numeros

            if (numero > maior)// guardando o maior valor
                maior = numero;

            count = count + 1;// contando as vezes até 5
        } while (count < 5);
        System.out.println("O maior número é: " + maior);
        System.out.println("A média dos números é: " + (soma / 5));

    }
}
