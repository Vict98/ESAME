package IS.gestioneNegozioVideogiochi.entity;
import java.util.HashSet;

public class Cliente {
	
	private String Nome;
	private String Cognome;
	private String Indirizzo;
	private String Email;
	private String Username;
	private String Password;
	private String NumeroCarta;
	private HashSet<Sconto> sconti;
	
	public Cliente(String Nome, String Cognome, String Indirizzo, String Email, String Username, String Password, String NumeroCarta) {
		this.Nome = Nome;
		this.Cognome = Cognome;
		this.Indirizzo = Indirizzo;
		this.Email = Email;
		this.Username = Username;
		this.Password = Password;
		this.NumeroCarta = NumeroCarta;
		sconti = new HashSet<Sconto>();
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

	public String getIndirizzo() {
		return Indirizzo;
	}

	public void setIndirizzo(String Indirizzo) {
		this.Indirizzo = Indirizzo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String Username) {
		this.Username = Username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}
	
	public void aggiungiSconto(Sconto Sconto) {
		sconti.add(Sconto);
	}
	
	public Sconto getSconto(String CodiceSconto) {
		for (Sconto s : sconti) {
			if (CodiceSconto == s.getCodice()) {
				return s;
			}
		}
		return null;
	}
	
	public String getNumeroCarta() {
		return NumeroCarta;
	}
	
	public void setNumeroCarta(String NumeroCarta) {
		this.NumeroCarta = NumeroCarta;
	}
	
}