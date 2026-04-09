package br.com.joaocarloslima;

public class Celeiro {
    private int capacidade = 50;
    private int qtdeBatatas = 10;
    private int qtdeCenouras = 10;
    private int qtdeMorangos = 10;

    public void armazenarBatata() {
        if (getEspacoDisponivel() < 2) throw new RuntimeException("Celeiro cheio");
        qtdeBatatas += 2;
    }

    public void armazenarCenoura() {
        if (getEspacoDisponivel() < 2) throw new RuntimeException("Celeiro cheio");
        qtdeCenouras += 2;
    }

    public void armazenarMorango() {
        if (getEspacoDisponivel() < 2) throw new RuntimeException("Celeiro cheio");
        qtdeMorangos += 2;
    }

    public void consumirBatata() {
        if (qtdeBatatas < 1) throw new RuntimeException("Não tem batata");
        qtdeBatatas--;
    }

    public void consumirCenoura() {
        if (qtdeCenouras < 1) throw new RuntimeException("Não tem cenoura");
        qtdeCenouras--;
    }

    public void consumirMorango() {
        if (qtdeMorangos < 1) throw new RuntimeException("Não tem morango");
        qtdeMorangos--;
    }

    public int getEspacoDisponivel() {
        return capacidade - (qtdeBatatas + qtdeCenouras + qtdeMorangos);
    }

    public double getOcupacao() {
        return (double) (qtdeBatatas + qtdeCenouras + qtdeMorangos) / capacidade;
    }

    public int getQtdeBatatas() { return qtdeBatatas; }
    public int getQtdeCenouras() { return qtdeCenouras; }
    public int getQtdeMorangos() { return qtdeMorangos; }
}
