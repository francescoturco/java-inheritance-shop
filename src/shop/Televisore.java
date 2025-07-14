package shop;

public class Televisore extends Prodotto {
    private int dimensioni;
    private boolean smart;

    public Televisore(String nome, String descrizione, double prezzo, int iva, int dimensioni, boolean smart) {
        super(nome, descrizione, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public int getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public String toString() {
        return nomeEsteso() + " | TV " + dimensioni + "\" " + (smart ? "Smart" : "Non Smart") + ", Prezzo: €" + getPrezzoFormattato();
    }
}