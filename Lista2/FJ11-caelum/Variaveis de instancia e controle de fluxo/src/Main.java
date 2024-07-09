
public class Main {
	 static int portas;
	 static int qtdportas;
	public static void main(String[] args) {
		Porta k = new Porta();
		k.abre();
		System.out.println("A porta está aberta? " + k.estaAberta() );
		k.fecha();
		System.out.println("A porta está aberta? " + k.estaAberta() );
		k.pinta( "Azul" );
		k.pinta("Vermelho");
		k.pinta("Amarelo");
		k.dimensaoX = 80;
		k.dimensaoY = 190;
		k.dimensaoZ = 20;
		Porta p1 = new Porta();
		Porta p2 = new Porta();
		Porta p3 = new Porta();
		p1.abre();
		p1.fecha();
		p2.abre();
		p2.fecha();
		p3.abre();
		p3.fecha();
		System.out.println("A porta p1 está aberta? " + p1.estaAberta());
		System.out.println("A porta p2 está aberta? " + p2.estaAberta());
		System.out.println("A porta p3 está aberta? " + p3.estaAberta());
		p1.pinta("Azul");
		p2.pinta("Amarelo");
		p3.pinta("Vermelho");
		portas = quantasPortasEstaoAbertas();
		}
	private static int quantasPortasEstaoAbertas() {
		if( p1.estaAberta() == true) {
			qtdporta++;
		}
		if( p2.estaAberta() == true ) {
			qtdporta++;
		}
		if( p3.estaAberta() == true ) {
			qtdporta++;
		}
		return qtdporta;
	}

}
