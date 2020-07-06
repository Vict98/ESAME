package IS.gestioneNegozioVideogiochi.entity;

public class Dipendente {
	
	private String Nome;
	private String Cognome;
	private String CodiceFiscale;
	private String Email;
	private String Password;
	
	public Dipendente(String Nome, String Cognome, String CodiceFiscale, String Email, String Password) {
		this.Nome = Nome;
		this.Cognome = Cognome;
		this.CodiceFiscale = CodiceFiscale;
		this.Email = Email;
		this.Password = Password;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public String getCognome() {
		return Cognome;
	}
	
	public void setCognome(String Cognome) {
		this.Cognome = Cognome;
	}
	
	public String getCodiceFiscale() {
		return CodiceFiscale;
	}
	
	public void setCodiceFiscale(String CodiceFiscale) {
		this.CodiceFiscale = CodiceFiscale;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String Password) {
		this.Password = Password;
	}
}
