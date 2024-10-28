package model;

import interfaces.Acoes;

public class Guerreiro extends Personagem implements Acoes {

    public Guerreiro(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar(Personagem p) {
        int dano = (int) (Math.random() * 40 + 1);
        p.setVida(p.getVida() - dano);
        System.out.println(getNome() + " atacou " + p.getNome() + " causando " + dano + " de dano.");
    }
}
