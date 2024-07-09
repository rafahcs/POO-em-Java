
public class Casa {
	String color;
	boolean aberta;
	Porta p1; 
	Porta p2; 
	Porta p3;
	int qtdporta;
	
	void pintaCasa(String color) {
		this.color = color; 
		System.out.println("A casa foi pintada de " + color);
	}
	void abre() {
		this.aberta = true;
	}
	void fechada() {
		this.aberta = false;
	}
	boolean estaAberta() {
		return aberta;
	}
	int quantasPortasEstaoAbertas() {
		
	}
}
