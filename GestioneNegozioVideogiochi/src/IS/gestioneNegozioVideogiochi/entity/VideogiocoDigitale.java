package IS.gestioneNegozioVideogiochi.entity;

public class VideogiocoDigitale extends Videogioco {
	
	public VideogiocoDigitale (String CodiceId, String Titolo, int CodicePEGI, double Prezzo, Console console) {
		super(CodiceId, Titolo, CodicePEGI, Prezzo, console);
	}
	
	public VideogiocoDigitale (String Titolo, int CodicePEGI, double Prezzo, Console console) {
		super(Titolo, CodicePEGI, Prezzo, console);
	}
}