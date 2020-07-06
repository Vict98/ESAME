package IS.gestioneNegozioVideogiochi.entity;

public class Ordine {
	
	private Videogioco videogioco;
	private int Quantit�;
	
	public Ordine(Videogioco videogioco, int Quantit�) {
		this.videogioco = videogioco;
		this.Quantit� = Quantit�;
	}
	
	public Videogioco getvideogioco() {
		return videogioco;
	}
	
	public void setvideogioco(Videogioco videogioco) {
		this.videogioco = videogioco;
	}
	
	public int getQuantit�() {
		return Quantit�;
	}
	
	public void setQuantit�(int Quantit�) {
		this.Quantit� = Quantit�;
	}
	
	public double calcolaPrezzo() {
		return videogioco.getPrezzo()*Quantit�;
	}
}
