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

import shop.Cuffie;
import shop.Smartphone;
import shop.Televisore;

public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Xiaomi Redmi 8Plus", "Android 16, 8GB ram", 850, 22, "GHK5896XCV", 256);
        Televisore tv = new Televisore("SAMSUNG QLED", "Televisore 4K Tecnlogia QLED SAMSUNG", 899.99, 22, 55, true);
        Cuffie cuffie = new Cuffie("Sony Diablo X5", "Cuffie BassBoosted", 250.0, 22, "Grigio", true);

        System.out.println(phone);
        System.out.println(tv);
        System.out.println(cuffie);
    }
}
