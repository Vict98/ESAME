package IS.gestioneNegozioVideogiochi;
import IS.gestioneNegozioVideogiochi.entity.*;
import java.util.ArrayList;
import IS.gestioneNegozioVideogiochi.control.*;

public class Main {

	public static void main(String[] args) {
		
		GestoreVideogiochi gv = new GestoreVideogiochi();
		GestoreAcquisti ga = new GestoreAcquisti();
		
		String Titolo = "CALL OF DUTY: MODERN WARFARE";
		int CodicePEGI = 18;
		double Prezzo = 54.99;
		Console console = Console.PS4;
		int Quantit‡Disponibile = 14;
		Videogioco v1 = new VideogiocoFisico(Titolo, CodicePEGI, Prezzo, console, Quantit‡Disponibile);
		gv.aggiungiVideogioco(v1);
		
		Titolo = "THE LAST OF US PARTE II";
		CodicePEGI = 18;
		Prezzo = 66.99;
		console = Console.PS4;
		Videogioco v2 = new VideogiocoDigitale(Titolo, CodicePEGI, Prezzo, console);
		gv.aggiungiVideogioco(v2);
		
		Titolo = "THE ELDER SCROLLS V: SKYRIM";
		CodicePEGI = 18;
		Prezzo = 10.99;
		console = Console.PC;
		Quantit‡Disponibile = 32;
		Videogioco v3 = new VideogiocoFisico(Titolo, CodicePEGI, Prezzo, console, Quantit‡Disponibile);
		gv.aggiungiVideogioco(v3);
		
		Titolo = "FIFA 20";
		CodicePEGI = 3;
		Prezzo = 19.99;
		console = Console.XBOXONE;
		Videogioco v4 = new VideogiocoDigitale(Titolo, CodicePEGI, Prezzo, console);
		gv.aggiungiVideogioco(v4);
		
		gv.visualizzaTitoli(Console.PS4);
		
		ArrayList<Ordine> or = new ArrayList<Ordine>();
		Ordine o = new Ordine(v1, 2);
		or.add(o);
		o = new Ordine(v2, 2);
		or.add(o);
		Cliente c = new Cliente("Pippo", "Pluto", "via del Campo", "Pippo@Pluto.it", "Pippo98", "paperopoli", "1056");
		Sconto s = new Sconto("271172", 20);
		c.aggiungiSconto(s);
		ga.acquistaVideogioco(or, c, "271172");
		}

}