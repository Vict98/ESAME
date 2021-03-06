package IS.gestioneNegozioVideogiochi.entity;

public class VideogiocoFisico extends Videogioco {
	
	private int QuantitąDisponibile;
	
	public VideogiocoFisico(String CodiceId, String Titolo, int CodicePEGI, double Prezzo, Console console, int QuantitąDisponibile) {
		super(CodiceId, Titolo, CodicePEGI, Prezzo, console);
		this.QuantitąDisponibile = QuantitąDisponibile;
	}
	
	public VideogiocoFisico(String Titolo, int CodicePEGI, double Prezzo, Console console, int QuantitąDisponibile) {
		super(Titolo, CodicePEGI, Prezzo, console);
		this.QuantitąDisponibile = QuantitąDisponibile;
	}
	
	public int getQuantitąDisponibile() {
		return QuantitąDisponibile;
	}
	
	public void setQuantitąDisponibile(int QuantitąDisponibile) {
		this.QuantitąDisponibile = QuantitąDisponibile;
	}
}