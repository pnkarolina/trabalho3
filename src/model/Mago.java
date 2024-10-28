package model;

import interfaces.Acoes;

public class Mago extends Personagem implements Acoes {

    public Mago(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar(Personagem p) {
        int dano = (int) (Math.random() * 40 + 1);
        p.setVida(p.getVida() - dano);
        System.out.println(getNome() + " lançou um feitiço em " + p.getNome() + " causando " + dano + " de dano.");
    }
}