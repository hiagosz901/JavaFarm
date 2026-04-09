package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
    private List<Terreno> terrenos = new ArrayList<>();
    private Celeiro celeiro;

    public Fazenda() {
        celeiro = new Celeiro();
        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                terrenos.add(new Terreno());
            }
        }
    }

    public void plantarBatata(int x, int y) {
        Terreno t = terrenos.get(x * 13 + y);
        if (t.estaOcupado()) throw new RuntimeException("Já tem coisa aqui mn");
        if (celeiro.getQtdeBatatas() < 1) throw new RuntimeException("tu não tem batata no celeiro");
        t.plantar(new Batata());
        celeiro.consumirBatata();
    }

    public void plantarCenoura(int x, int y) {
        Terreno t = terrenos.get(x * 13 + y);
        if (t.estaOcupado()) throw new RuntimeException("Já tem coisa aqui mn");
        if (celeiro.getQtdeCenouras() < 1) throw new RuntimeException("tu não tem cenoura no celeiro");
        t.plantar(new Cenoura());
        celeiro.consumirCenoura();
    }

    public void plantarMorango(int x, int y) {
        Terreno t = terrenos.get(x * 13 + y);
        if (t.estaOcupado()) throw new RuntimeException("Já tem coisa aqui mn");
        if (celeiro.getQtdeMorangos() < 1) throw new RuntimeException("tu não tem morango no celeiro");
        t.plantar(new Morango());
        celeiro.consumirMorango();
    }

    public void colher(int x, int y) {
        Terreno t = terrenos.get(x * 13 + y);
        t.colher(celeiro);
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }

    public Terreno getTerreno(int x, int y) {
        return terrenos.get(x * 13 + y);
    }
}