
public class Porta {
	boolean aberta;
	String cor;
	int dimensaoY, dimensaoZ, dimensaoX;
	void abre() {
		this.aberta = true;
	}
	void fecha() {
		this.aberta = false;
	}
	void pinta(String cor) {
		this.cor = cor;
		System.out.println("A cor da porta foi alterada para: " + cor);
	}
	boolean estaAberta() {
		return aberta;
	}
}
