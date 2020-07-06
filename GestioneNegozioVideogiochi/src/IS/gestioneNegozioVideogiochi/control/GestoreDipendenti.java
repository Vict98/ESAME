package IS.gestioneNegozioVideogiochi.control;
import java.util.ArrayList;
import IS.gestioneNegozioVideogiochi.entity.*;

public class GestoreDipendenti {
	
	private ArrayList<Dipendente> dipendenti;
	private static GestoreDipendenti Instance = null;
	
	private GestoreDipendenti() {
		dipendenti = new ArrayList<Dipendente>();
		}
	
	public static GestoreDipendenti getInstance() {
		if (Instance == null) {
			Instance = new GestoreDipendenti();
		}
		return Instance;
	}
	
	public void aggiungiDipendente(Dipendente dipendente) {
		dipendenti.add(dipendente);
	}
	
	public void inviaNotifica() {
		
	}
	
}
