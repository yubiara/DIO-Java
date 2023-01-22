public class Operadores {
    public static void main(String[] args) {
        /*
         * // exemplo de como concatenar duas string
         * String nomeCompleto = "LINGUAGEM" + "JAVA";
         * System.out.print(nomeCompleto);
         * // exemplos de variaveis de string e int juntas na impressão
         * 
         * String concatenacao = "?";
         * 
         * concatenacao = 1 + 1 + 1 + "1";
         * System.out.print(concatenacao);
         * 
         * concatenacao = 1 + "1" + 1 + 1;
         * System.out.print(concatenacao);
         * 
         * concatenacao = 1 + "1" + 1 + "1";
         * System.out.print(concatenacao);
         * 
         * concatenacao = "1" + (1 + 1 + 1);
         * System.out.print(concatenacao);
         */

        // incrementando
        /*
         * int numero = 5;
         * numero++;
         * System.out.println(numero);
         * 
         * System.out.println(++ numero); // colocando o ++ antes da variavel funciona,
         * se for depois não funciona.
         */

        /*
         * // iF e ELSE
         * int a, b;
         * 
         * a = 6;
         * b = 6;
         * 
         * String resultado = "";
         * if (a == b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         * System.out.println(resultado);
         */

        // OPERADORES TERNARIOS
        int numero1 = 1;
        int numero2 = 2;

        Boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        if (numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");
        // trilha java
    }
}
