/*Creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- marca
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura
Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.*/

import java.util.Scanner;
import shop.Cuffie;
import shop.Prodotto;
import shop.Smartphone;
import shop.Televisore;

public class Carrello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prodotto[] carrello = new Prodotto[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Inserisci il tipo di prodotto (Smartphone, Televisore, Cuffie): ");
            String tipo = scanner.nextLine().trim().toLowerCase();

            System.out.println("Nome:");
            String nome = scanner.nextLine();

            System.out.println("Descrizione:");
            String descrizione = scanner.nextLine();

            System.out.println("Prezzo:");
            double prezzo = Double.parseDouble(scanner.nextLine());

            System.out.println("IVA:");
            int iva = Integer.parseInt(scanner.nextLine());

            if (tipo.equals("smartphone")) {
                System.out.println("IMEI:");
                String imei = scanner.nextLine();

                System.out.println("Memoria (GB):");
                int memoria = Integer.parseInt(scanner.nextLine());

                carrello[i] = new Smartphone(nome, descrizione, prezzo, iva, imei, memoria);

            } else if (tipo.equals("televisore")) {
                System.out.println("Dimensioni (pollici):");
                int dimensioni = Integer.parseInt(scanner.nextLine());

                System.out.println("Smart? (si/no):");
                boolean smart = Boolean.parseBoolean(scanner.nextLine());

                carrello[i] = new Televisore(nome, descrizione, prezzo, iva, dimensioni, smart);

            } else if (tipo.equals("cuffie")) {
                System.out.println("Colore:");
                String colore = scanner.nextLine();

                System.out.println("Wireless? (si/no):");
                boolean wireless = Boolean.parseBoolean(scanner.nextLine());

                carrello[i] = new Cuffie(nome, descrizione, prezzo, iva, colore, wireless);

            } else {
                System.out.println("Tipo non riconosciuto. Riprova.");
                i--; // per ripetere questo turno
                continue;
            }

            System.out.println("--- Prodotto aggiunto! ---\n");
        }

        // Stampa del carrello
        System.out.println("\n--- Carrello completo ---");
            for (int i = 0; i < carrello.length; i++) {
                System.out.println(carrello[i]);
            }
    }
}    

