package jogodados;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Jogo j = new Jogo();
        
        j.inserirJogadores();
        j.inserirApostas();
        j.jogarDados();
        j.mostrarResultado();
        j.mostrarVencendor();

    }
}
