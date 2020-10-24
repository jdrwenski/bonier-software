package drwenski.pos.main;

import drwenski.pos.model.Artikel;
import drwenski.pos.model.Rechnung;

public class TestRechnung {
	
	public TestRechnung() {
		Artikel salat = new Artikel(12345L, "Nudelsalat", 4.50, 15);
		Artikel tee = new Artikel(987600L, "Schwarzer Tee", 2.00, 100);
		Rechnung bon = new Rechnung(123456789L);
		bon.addArtikel(salat);
		bon.addArtikel(tee);
		//bon.addArtikel(salat);
		System.out.println(bon.getGesamtPreis());
	}

	public static void main(String[] args) {
		new TestRechnung();
	}

}
