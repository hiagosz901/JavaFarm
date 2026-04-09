package br.com.joaocarloslima;

public class Terreno {
    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;

    public void plantar(Batata b) {
        batata = b;
        cenoura = null;
        morango = null;
    }

    public void plantar(Cenoura c) {
        cenoura = c;
        batata = null;
        morango = null;
    }

    public void plantar(Morango m) {
        morango = m;
        batata = null;
        cenoura = null;
    }

    public void colher(Celeiro celeiro) {
        if (batata != null && batata.podeColher()) {
            celeiro.armazenarBatata();
            batata = null;
        } else if (cenoura != null && cenoura.podeColher()) {
            celeiro.armazenarCenoura();
            cenoura = null;
        } else if (morango != null && morango.podeColher()) {
            celeiro.armazenarMorango();
            morango = null;
        }

    }

    public boolean estaOcupado() {
        return batata != null || cenoura != null || morango != null;
    }

    public Batata getBatata() { return batata; }
    public Cenoura getCenoura() { return cenoura; }
    public Morango getMorango() { return morango; }
}