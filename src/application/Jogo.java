package application;

import model.Guerreiro;
import model.Mago;
import model.Personagem;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Personagem jogador = new Guerreiro("Jogador", 100);
        Personagem computador = new Mago("Computador", 100);

        System.out.println("Início do combate!");

        while (jogador.estaVivo() && computador.estaVivo()) {

            System.out.println("\nEscolha sua ação: 1 - Atacar, 2 - Curar");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                jogador.atacar(computador);
            } else if (escolha == 2) {
                jogador.curar();
            }

            if (!computador.estaVivo()) {
                System.out.println("Você venceu!");
                break;
            }

            int acaoComputador = (int) (Math.random() * 2 + 1);
            if (acaoComputador == 1) {
                computador.atacar(jogador);
            } else {
                computador.curar();
            }

            if (!jogador.estaVivo()) {
                System.out.println("Você perdeu!");
                break;
            }

            System.out.println("\nStatus:");
            System.out.println(jogador.getNome() + " - Vida: " + jogador.getVida());
            System.out.println(computador.getNome() + " - Vida: " + computador.getVida());
        }

        scanner.close();
    }
}
