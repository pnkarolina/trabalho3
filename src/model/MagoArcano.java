package model;

public class MagoArcano extends Mago {

    public MagoArcano(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar(Personagem p) {
        int dano = (int) (Math.random() * 50 + 1);
        p.setVida(p.getVida() - dano);
        System.out.println(getNome() + " lançou um feitiço arcano em " + p.getNome() + " causando " + dano + " de dano.");
    }
}

