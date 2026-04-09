package br.com.joaocarloslima;

public class Batata {
    private int tamanho = 1;
    private int tempoDeVida = 0;
    private int tempoDeCrescimento = 6;

    public void crescer() {
        tempoDeVida++;
        if (tempoDeVida % tempoDeCrescimento == 0 && tamanho < 4) {
            tamanho++;
        }
    }

    public boolean podeColher() {
        return tamanho == 4;
    }

    public String getImagem() {
        return "images/batata" + tamanho + ".png";
    }
}