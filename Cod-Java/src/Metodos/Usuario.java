package Metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();// validar se está dominuindo
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();// validar se está aumentando

        System.out.println("Canal atual? " + smartTv.canal);// imprimindo para ver qual o canal antes
        smartTv.mudarCanal(13);
        System.out.println("Canal atual? " + smartTv.canal);// conferindo se o canal mudou

        System.out.println("Volume atual? " + smartTv.volume);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status - TV ligada? " + smartTv.ligada);
    }
}
