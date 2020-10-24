package drwenski.pos.main;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import drwenski.pos.model.Artikel;
import drwenski.pos.model.Rechnung;
import drwenski.pos.view.ArtikelPanel;
import drwenski.pos.view.RechnungPanel;

public class TestFrame extends JFrame {
	
	public TestFrame() {
		// einzelne Artikel erstellen mittels Artikel-Konstruktor
		Artikel salat = new Artikel(12345L, "Nudelsalat", 4.50, 15);
		Artikel tee = new Artikel(987600L, "Schwarzer Tee", 1.50, 100);
		// alle Artikel zum Array zusammenfassen
		Artikel[] sortiment = {salat, tee};
		Rechnung bon = new Rechnung(123456L);
		// Panel erzeugen und in das Fenster eingefügt
		RechnungPanel ausgabe = new RechnungPanel(bon);
		this.add(new ArtikelPanel(sortiment,ausgabe));
		this.add(ausgabe);
		this.setLayout(new FlowLayout());
		this.setSize(500,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TestFrame();
	}

}
