import java.util.Random;
import java.util.Scanner;



public class JogoDado {

    public static void main(String[] args) {

        int pontos = 0;

        boolean sair = false;
        System.out.println("Digite (9) a qualquer momento para sair do jogo");
        System.out.println("Digite (0) para reiniciar o jogo");

        while (!sair) {
            System.out.println("Você tem " + pontos + " pontos!");

            Scanner s = new Scanner(System.in);
            System.out.println("Qual seu chute?");
            int comando = s.nextInt();

            if (9 == comando) {
                break;
            } else if (0==comando) {
                pontos = 0;
            } else if (comando >= 1 && comando <= 6){
                boolean resultado = jogaDado(comando);
                if (resultado) {
                pontos++;
                }
            } else {
                System.out.println("Digite um numero válido");
            }
        }


    }

    private static boolean jogaDado(int chute) {

        Random r = new Random();
        int dado = r.nextInt(6) + 1;

        System.out.println("Resultado dos dados é: " + dado);

        if (dado == chute) {
            System.out.println("Você acertou Parabens");
            return true;
        } else {
            System.out.println("Você  Errou");
            return false;
        }
    }

}