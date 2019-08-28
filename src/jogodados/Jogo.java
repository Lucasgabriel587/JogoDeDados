package jogodados;

import java.util.Scanner;

public class Jogo {
    private int resultado;
    private Dado dado1 = new Dado();
    private Dado dado2 = new Dado();
    //private Jogador jogador1, jogador2;
    private Jogador[] jogadores;
    private Scanner entrada = new Scanner(System.in);
    private int qtd;
    
    public void inserirJogadores(){
        System.out.println("Informe quantos jogadores, irão jogar: ");
        do{
            System.out.println("Máximo 11 jogadores");
            qtd = entrada.nextInt();
        }while(qtd > 11);
        jogadores = new Jogador[qtd];
        
        for(int i = 0; i < jogadores.length; i++){
            System.out.println("Jogador" + (i+1) + " informe seu nome:");
            jogadores[i] = new Jogador(entrada.next());
        }
        /*
        for(Jogador j : jogadores){
            System.out.println("Informe o nome do Jogador:");
            j = new Jogador(entrada.next());
        }
        */
    }
    
    public void inserirApostas(){
        int aposta;
        for(Jogador j : jogadores){
        do{
            System.out.println(j.getNome()+" informe sua aposta:");
            aposta = entrada.nextInt();
        }while(aposta < 2 || aposta > 12);
        j.setValorAposta(aposta);
        }
    }
    
    public void jogarDados(){
        dado1.setValorFace();
        dado2.setValorFace();
    }
    
    public void mostrarResultado(){
        resultado = dado1.getValorFace()+dado1.getValorFace();
        System.out.println("Resultado: "+resultado);
    }
    
    public void mostrarVencendor(){
        boolean ganhou = false;
        for(Jogador j : jogadores){
        if(resultado == j.getValorAposta()){
            System.out.println(j.getNome() + " venceu a aposta.");
            ganhou = true;
        }
        }
        if (!ganhou){
            System.out.println("O computador ganhou.");
        }
    }
}
