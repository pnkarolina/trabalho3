package model;

public abstract class Personagem {

    private String nome;
    private int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public abstract void atacar(Personagem p);

    public void curar() {
        int valorCura = (int) (Math.random() * 20 + 1);
        this.vida += valorCura;
        System.out.println(nome + " curou " + valorCura + " pontos de vida.");
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}

