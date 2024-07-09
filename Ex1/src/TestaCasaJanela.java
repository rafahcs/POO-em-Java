
public class TestaCasaJanela {

	public static void main(String[] args ) {
		Janela j = new Janela();
		j.cor = "cinza";
		j.material = "alumínio";
		Casa c = new Casa();
		c.cor = "verde";
		c.numero = 3;
		c.janela.cor = "preta";
		c.janela.material = "ferro";
		System.out.println("A casa de cor " + c.cor + " e número " + c.numero + " tem janela de cor " + c.janela.cor + " e material de " + c.janela.material);
	}

}
