package jogodados;

import java.util.Scanner;

public class Jogo {
    private int resultado;
    private Dado dado1 = new Dado();
    private Dado dado2 = new Dado();
    private Jogador jogador1, jogador2;
    private Scanner entrada = new Scanner(System.in);
    
    public void inserirJogadores(){
        System.out.println("Jogador1, informe seu nome: ");
        jogador1 = new Jogador(entrada.nextLine());
        
        System.out.println("Jogador2, informe seu nome:");
        jogador2 = new Jogador(entrada.next());
    }
    public void inserirApostas(){
        int aposta;
        do{
            System.out.println(jogador1.getNome()+" informe sua aposta:");
            aposta = entrada.nextInt();
        }while(aposta < 2 || aposta > 12);        
        jogador1.setValorAposta(aposta);
        
        do{
            System.out.println(jogador2.getNome()+" informe sua aposta:");
            aposta = entrada.nextInt();
            if(aposta == jogador1.getValorAposta())
            {
                System.out.println("Valor já escolhido. Tente outro."); 
            }
        }while(aposta < 2 || aposta > 12 || aposta == jogador1.getValorAposta());     
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
        if(resultado == jogador1.getValorAposta())
            System.out.println("Jogador1 venceu a aposta");
        else if(resultado == jogador2.getValorAposta())
            System.out.println("Jogador2 venceu a aposta");
        else 
            System.out.println("Computador venceu.");
    }
}
