package drwenski.pos.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

import drwenski.pos.model.Artikel;
import drwenski.pos.model.Rechnung;

public class RechnungPanel extends JPanel {
	Rechnung rechnung;
	
	public RechnungPanel(Rechnung rechnung) {
		this.rechnung = rechnung;
	}
	
	public void addArtikel(Artikel neuerArtikel) {
		this.add(new JLabel(neuerArtikel.bezeichnung+" "+neuerArtikel.preis));
		rechnung.addArtikel(neuerArtikel);
		this.revalidate();
		this.repaint();
		// zum Testen:
		System.out.println(rechnung.getGesamtPreis());
	}
}
