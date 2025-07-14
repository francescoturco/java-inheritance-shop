package shop;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean wireless;

    public Cuffie(String nome, String descrizione, double prezzo, int iva, String colore, boolean wireless) {
        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }


    public String toString() {
        return nomeEsteso() + " | Cuffie " + (wireless ? "Wireless" : "Cablato") + " - Colore: " + colore + ", Prezzo: €" + getPrezzoFormattato();
    }






}
