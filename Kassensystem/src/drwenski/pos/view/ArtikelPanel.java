package drwenski.pos.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import drwenski.pos.model.Artikel;

public class ArtikelPanel extends JPanel {
	JButton[] auswahl = new JButton[15];
	Artikel[] sortiment;
	RechnungPanel ausgabe;
	
	public ArtikelPanel(Artikel[] sortiment, RechnungPanel ausgabe) {
		this.sortiment = sortiment;
		this.ausgabe = ausgabe;
		this.setLayout(new GridLayout(5,3));
		for (int i=0; i<sortiment.length; i++) {
			auswahl[i] = new JButton(sortiment[i].bezeichnung);
			this.add(auswahl[i]);
			final Artikel gewaehlterArtikel = sortiment[i];
			auswahl[i].addActionListener(event -> handle(event, gewaehlterArtikel));
		}
	}
	
	public void handle(ActionEvent event, Artikel artikel) {
			ausgabe.addArtikel(artikel);
	}
}
