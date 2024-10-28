package model;

public class GuerreiroEspecial extends Guerreiro {

    public GuerreiroEspecial(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar(Personagem p) {
        int dano = (int) (Math.random() * 50 + 1);
        p.setVida(p.getVida() - dano);
        System.out.println(getNome() + " realizou um ataque especial em " + p.getNome() + " causando " + dano + " de dano.");
    }
}

