package questaoExtra;
import java.util.Scanner;


public class atividadeExtra {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Controle c = new Controle();
		String posicao;
		int valida = 0;
		int jogadas = 0;

		System.out.println("-________________________-");
		System.out.println("|      JOGO DA VEIA     |");
		System.out.println("|------------------------|");
		System.out.println("|      Quem vai vencer?     |");
		System.out.println("|                        |");
		System.out.println("|         X Vs O         |");
		System.out.println("|                        |");
		System.out.println("|        __|__|__        |");
		System.out.println("|        __|__|__        |");
		System.out.println("|          |  |          |");
		System.out.println("|                        |");
		System.out.println("|________________________|");
		System.out.println("\n");
		System.out.println("JOGADOR-1:|X| JOGADOR-2:|O|");
		System.out.println("\n");
		System.out.println("        _1_|_2_|_3_       ");
		System.out.println("        _4_|_5_|_6_       ");
		System.out.println("         7 | 8 | 9        ");
		System.out.println("\n");

		while (true) {

			do {
				System.out.println("Jogador 1, vamos comecar o jogo, informe a posicao que deseja:");
				posicao = scanf.next();
				while (!c.Confere(posicao)) {
					System.out.println("jogada nao permitida!\nTente novamente.");
					System.out.println("Jogador 1,vamos comecar o jogo, informe a posicao que deseja:");
					posicao = scanf.next();
					valida = 0;
				}
				c.Jogada(posicao, "x");
				valida = 1;

			} while (valida == 0);
			jogadas++;
			valida = 0;
			c.Exibir();
			if (!c.Vencedor(jogadas).equals("null")) {
				break;
			}
			do {
				System.out.println("Jogador 2,vamos comecar o jogo, informe a posicao que deseja:");
				posicao = scanf.next();
				while (!c.Confere(posicao)) {
					System.out.println("jogada permitida!\nTente novamente.");
					System.out.println("Jogador 2,vamos comecar o jogo, informe a posicao que deseja:");
					posicao = scanf.next();
					valida = 0;
				}
				c.Jogada(posicao, "o");
				valida = 1;

			} while (valida == 0);
			jogadas++;
			valida = 0;
			c.Exibir();
			if (!c.Vencedor(jogadas).equals("null")) {
				break;

			}

		}
		System.out.println("Final de jogo! Resultado: " + c.Vencedor(jogadas));
	}


}
