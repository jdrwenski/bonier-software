package drwenski.pos.model;

public class Rechnung {
	final long rechnungsNr;
	Artikel[] bestellung;	// vgl. ArrayList<Artikel>
	int anzahl;
	static final int maxAnzahl = 20;	// wie "const"
	
	public Rechnung(long rechnungsNr) {
		this.rechnungsNr = rechnungsNr;
		this.bestellung = new Artikel[maxAnzahl];
		this.anzahl = 0;
	}

	public void addArtikel(Artikel neuerArtikel) {
		bestellung[anzahl] = neuerArtikel;
		anzahl++;
	}
	
	public double getGesamtPreis() {
		double gesamtpreis = 0.0;
		for (int i=0; i<anzahl; i++) {
			gesamtpreis += bestellung[i].preis;
		}
		return gesamtpreis;
	}
}
