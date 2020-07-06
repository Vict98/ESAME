package IS.gestioneNegozioVideogiochi.entity;

public class VideogiocoFisico extends Videogioco {
	
	private int Quantit‡Disponibile;
	
	public VideogiocoFisico(String CodiceId, String Titolo, int CodicePEGI, double Prezzo, Console console, int Quantit‡Disponibile) {
		super(CodiceId, Titolo, CodicePEGI, Prezzo, console);
		this.Quantit‡Disponibile = Quantit‡Disponibile;
	}
	
	public VideogiocoFisico(String Titolo, int CodicePEGI, double Prezzo, Console console, int Quantit‡Disponibile) {
		super(Titolo, CodicePEGI, Prezzo, console);
		this.Quantit‡Disponibile = Quantit‡Disponibile;
	}
	
	public int getQuantit‡Disponibile() {
		return Quantit‡Disponibile;
	}
	
	public void setQuantit‡Disponibile(int Quantit‡Disponibile) {
		this.Quantit‡Disponibile = Quantit‡Disponibile;
	}
}