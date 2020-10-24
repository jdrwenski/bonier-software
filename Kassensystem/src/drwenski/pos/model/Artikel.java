package drwenski.pos.model;

// Fachkonzept-Klasse
public class Artikel {
	// Deklarationsteil
	public final long artikelNr;
	public String bezeichnung;
	public double preis;
	public int anzahl;
	
	// Konstruktor
	public Artikel(long artikelNr, String bezeichnung, double preis, int anzahl) {
		this.artikelNr = artikelNr;
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		this.anzahl = anzahl;
	}

	
}
