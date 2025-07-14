package shop;

import java.util.Random;

public class Prodotto {

    // Attributi privati
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    // Costruttore con parametri
    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(10000); 
        setNome(nome);
        setDescrizione(descrizione);
        setPrezzo(prezzo);
        setIva(iva);
    }

   
   
    // Getter
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getIva() {
        return iva;
    }

    
    
    
    // Setter custom
    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Il nome non può essere vuoto.");
        }
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione != null ? descrizione : "";
    }

    public void setPrezzo(double prezzo) {
        if (prezzo >= 0) {
            this.prezzo = prezzo;
        } else {
            throw new IllegalArgumentException("Il prezzo non può essere negativo.");
        }
    }

    public void setIva(int iva) {
        if (iva >= 0 && iva <= 100) {
            this.iva = iva;
        } else {
            throw new IllegalArgumentException("L'IVA deve essere compresa tra 0 e 100.");
        }
    }

    
    
    // Metodi
    public double prezzoBase() {
        return prezzo;
    }

    public double prezzoConIva() {
        return  prezzo + (prezzo * iva / 100);
    }

    public String nomeEsteso() {
        return codice + " - " + nome;
    }

    public String getPrezzoFormattato() {
        return String.format("%.2f", prezzoConIva());
    }
}