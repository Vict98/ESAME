package IS.gestioneNegozioVideogiochi.control;
import IS.gestioneNegozioVideogiochi.entity.*;
import IS.gestioneNegozioVideogiochi.boundary.*;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.*;

public class GestoreAcquisti {
	
	private ArrayList<Acquisto> acquisti;
	private LocalDate DataCorrente;
	
	public GestoreAcquisti() {
		acquisti = new ArrayList<Acquisto>();
		DataCorrente = LocalDate.now();
	}
	
	public void aggiungiAcquisto(Acquisto acquisto) {
		acquisti.add(acquisto);
	}
	
	public void rimuoviAcquisto(Acquisto acquisto) {
		acquisti.remove(acquisto);
	}
	
	public void acquistaVideogioco(ArrayList<Ordine> Ordini, Cliente cliente, String CodiceSconto) {
		System.out.println("Sto creando un nuovo acquisto");
		Acquisto a = new Acquisto(cliente);
		NumberFormat nf = new DecimalFormat("0.00");
		
		for (Ordine o : Ordini) {
			a.aggiungiOrdine(o);
			
			if (o.getvideogioco() instanceof VideogiocoFisico) {
				VideogiocoFisico vf = (VideogiocoFisico) o.getvideogioco();
				System.out.println("Sto decrementando la quantit‡ di " + vf.getTitolo() + " presenti in magazzino");
				vf.setQuantit‡Disponibile(vf.getQuantit‡Disponibile() - o.getQuantit‡());
				System.out.println("Quantit‡ rimasta: " + vf.getQuantit‡Disponibile());
				GestoreDipendenti.getInstance().inviaNotifica();
			}
			else {
				System.out.println("Codici generati per le " + o.getQuantit‡() + " copie di " + o.getvideogioco().getTitolo() + " acquistate: ");
				for (int i = 0; i < o.getQuantit‡(); i++) {
				String codice = generaCodice(); 
				System.out.println(codice);
				}				
			}
		}
		
		System.out.println("Conto totale per l'acquisto: " + nf.format(a.getConto()) + "Ä");	
		if (CodiceSconto != null) {
			Sconto s = cliente.getSconto(CodiceSconto);
			if (s != null && s.isApplicato() == false) {
				a.ApplicaSconto(s);
				System.out.println("Sconto applicato, conto totale: " + nf.format(a.getConto()) + "Ä");
			}
			else {
				System.out.println("Lo sconto con codice " + CodiceSconto + " non esiste o Ë stato gi‡ applicato");
			}
		}
		
		aggiungiAcquisto(a);
		BSistemaDiPagamento BSDP = new BSistemaDiPagamento();
		BSDP.effetuaTransazione(cliente.getNumeroCarta());
		System.out.println("Acquisto effettuato con successo!");
		
	}
	
	public ArrayList<Acquisto> generaReport() {
		return new ArrayList<Acquisto>();
	}
	
	public ArrayList<Cliente> visualizzaNClienti() {
		return new ArrayList<Cliente>();
	}
	
	public LocalDate getDataCorrente() {
		return DataCorrente;
	}
	
	public void setDataCorrente(LocalDate DataCorrente) {
		this.DataCorrente = DataCorrente;
	}
	
	private String generaCodice() {
		return Long.toString(System.nanoTime());
	}
}