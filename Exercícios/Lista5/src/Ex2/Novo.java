package Ex2;
//a)
public class Novo extends Imovel {
	public double getPreco() {
		this.preco = preco * 1.1;
		int p = (int) preco;
		return preco;
	}
}
