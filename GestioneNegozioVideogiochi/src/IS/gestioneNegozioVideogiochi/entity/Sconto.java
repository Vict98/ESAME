package IS.gestioneNegozioVideogiochi.entity;

public class Sconto {
	
	private String Codice;
	private int Percentuale;
	private boolean Applicato;
	
	public Sconto(String Codice, int Percentuale) {
		this.Codice = Codice;
		this.Percentuale = Percentuale;
		Applicato = false;
	}
	
	public String getCodice() {
		return Codice;
	}
	
	public void setCodice(String Codice) {
		this.Codice = Codice;
	}
	
	public int getPercentuale() {
		return Percentuale;
	}
	
	public void setPercentuale(int Percentuale) {
		this.Percentuale = Percentuale;
	}
	
	public boolean isApplicato() {
		return Applicato;
	}
	
	public void setApplicato(boolean Applicato) {
		this.Applicato = Applicato;
	}

}