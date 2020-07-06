package IS.gestioneNegozioVideogiochi.entity;
import java.util.ArrayList;
import java.time.*;

public class Acquisto {
	
	private ArrayList<Ordine> ordini;
	LocalDate Data;
	double Conto;
	private Cliente Acquirente;
	
	public Acquisto(Cliente Acquirente) {
		ordini = new ArrayList<Ordine>();
		Data = LocalDate.now();
		Conto = 0;
		this.Acquirente = Acquirente;
	}
	
	public void aggiungiOrdine(Ordine ordine) {
		ordini.add(ordine);
		Conto += ordine.calcolaPrezzo();
	}
	
	public void rimuoviOrdine(Ordine ordine) {
		ordini.remove(ordine);
		Conto -= ordine.calcolaPrezzo();
	}
	
	public LocalDate getData() {
		return Data;
	}
	
	public void setData(LocalDate Data) {
		this.Data = Data;
	}
	
	public double getConto() {
		return Conto;
	}
	
	public void setConto(double Conto) {
		this.Conto = Conto;
	}
	
	public Cliente getAcquirente() {
		return Acquirente;
	}
	
	public void setAcquirente(Cliente Acquirente) {
		this.Acquirente = Acquirente;
	}
	
	public void ApplicaSconto(Sconto sconto) {
		Conto = Conto - (Conto*sconto.getPercentuale() / 100);
	}
	
}