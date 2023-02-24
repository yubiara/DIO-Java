package Arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = { 5, 10, 15, 20, 25, 30 };// declarando um vetor com valores fixos

        System.out.print("vetor: ");
        int count = 0;

        while (count < (vetor.length)) { // o length ler as posições do vetor
            System.out.print(vetor[count] + " ");
            count++;
        }
        // imprimindo o inverso do vetor
        System.out.println("\nVetor inverso: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
