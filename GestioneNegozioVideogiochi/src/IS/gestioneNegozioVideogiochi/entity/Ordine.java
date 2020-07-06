package IS.gestioneNegozioVideogiochi.entity;

public class Ordine {
	
	private Videogioco videogioco;
	private int Quantità;
	
	public Ordine(Videogioco videogioco, int Quantità) {
		this.videogioco = videogioco;
		this.Quantità = Quantità;
	}
	
	public Videogioco getvideogioco() {
		return videogioco;
	}
	
	public void setvideogioco(Videogioco videogioco) {
		this.videogioco = videogioco;
	}
	
	public int getQuantità() {
		return Quantità;
	}
	
	public void setQuantità(int Quantità) {
		this.Quantità = Quantità;
	}
	
	public double calcolaPrezzo() {
		return videogioco.getPrezzo()*Quantità;
	}
}
