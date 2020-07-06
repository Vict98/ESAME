package IS.gestioneNegozioVideogiochi.entity;

public abstract class Videogioco {
	
	private String CodiceId;
	private String Titolo;
	private int CodicePEGI;
	private double Prezzo;
	private Console console;
	
	public Videogioco(String CodiceId, String Titolo, int CodicePEGI, double Prezzo, Console console) {
		this.CodiceId = CodiceId;
		this.Titolo = Titolo;
		this.CodicePEGI = CodicePEGI;
		this.Prezzo = Prezzo;
		this.console = console;
	}
	
	public Videogioco(String Titolo, int CodicePEGI, double Prezzo, Console console) {
		this.CodiceId = "-1";
		this.Titolo = Titolo;
		this.CodicePEGI = CodicePEGI;
		this.Prezzo = Prezzo;
		this.console = console;
	}
	
	public String getCodiceId() {
		return CodiceId;
	}
	
	public void setCodiceId(String CodiceId) {
		this.CodiceId = CodiceId;
	}
	
	public String getTitolo() {
		return Titolo;
	}
	
	public void setTitolo(String Titolo) {
		this.Titolo = Titolo;
	}
	
	public int getCodicePEGI() {
		return CodicePEGI;
	}
	
	public void setCodicePEGI(int CodicePEGI) {
		this.CodicePEGI = CodicePEGI;
	}
	
	public double getPrezzo() {
		return Prezzo;
	}
	
	public void setPrezzo(double Prezzo) {
		this.Prezzo = Prezzo;
	}
	
	public Console getConsole() {
		return console;
	}
	
	public void setConsole(Console console) {
		this.console = console;
	}
}
