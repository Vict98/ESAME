package IS.gestioneNegozioVideogiochi.control;
import java.util.ArrayList;
import IS.gestioneNegozioVideogiochi.entity.*;

public class GestoreVideogiochi { 
	
	private ArrayList<Videogioco> Videogiochi;
	
	public GestoreVideogiochi() {
		Videogiochi = new ArrayList<Videogioco>();
	}
	
	public void aggiungiVideogioco(Videogioco videogioco) {
		Videogiochi.add(videogioco);
	}
	
	public void rimuoviVideogioco(Videogioco videogioco) {
		Videogiochi.remove(videogioco);
	}
	
	public void visualizzaTitoli(Console c) {
		System.out.println("Titoli disponibili per " + c.name() + ":");
		for (Videogioco v : Videogiochi) {
			if (c == v.getConsole()) {
				System.out.println(v.getTitolo());
			}
		}
	}
	
}