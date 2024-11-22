import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(50) + 1;
        int tentativa = 1;
        int numeroEscolhidoUsuario = 0;

        System.out.println("Olá, bem vindo ao jogo de adivinhação ");
        System.out.println("Temos um número de 1 até 50, e você tem 5 tentativas... ");

        while (tentativa <= 5) {
            System.out.println(String.format("Tentativa %d de 5. Digite o próximo número: ", tentativa));
            numeroEscolhidoUsuario = leitura.nextInt();

            if (numeroEscolhidoUsuario == numeroSorteado) {
                System.out.println(String.format("Parabéns!!! Você acertou o número sorteado %d com o chute %d!!!", numeroSorteado, numeroEscolhidoUsuario));
                break;
            } else if (numeroEscolhidoUsuario > numeroSorteado) {
                System.out.println("Errou. O numero sorteado é menor.");
            } else {
                System.out.println("Errou. O numero sorteado é maior.");
            }
            tentativa++;
        }

        if (tentativa > 5) {
            System.out.println("Que pena! Você perdeu. O número sorteado era " + numeroSorteado);
        }

        leitura.close(); // Fechar Scanner
    }
}