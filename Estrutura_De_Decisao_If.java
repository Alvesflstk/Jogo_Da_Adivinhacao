import java.util.Scanner;
import java.util.Random;
public class Estrutura_De_Decisao_If {
    public static void main(String[] args){
        jogo();
    }

    static void jogo(){
        Random numeroAleatorio = new Random();
        int capturaDeAleatorio = numeroAleatorio.nextInt(10);
        // capturar resposta usuario
        Scanner capturar = new Scanner(System.in);
        int numeroUser = 0;
        System.out.println("Pensei em um numero de 1 a 10 tente adivinhar ");
        while(numeroUser != capturaDeAleatorio){



            numeroUser = capturar.nextInt();

            if(numeroUser != capturaDeAleatorio){
                System.out.println("voce nao acertou tente denovo ");
            }else{
                System.out.println("Parabens Meu garoto(a)");
            }
        }
    }
}
