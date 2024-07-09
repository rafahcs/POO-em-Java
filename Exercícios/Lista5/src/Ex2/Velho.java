package Ex2;
//b)
public class Velho extends Imovel{
	public double getPreco() {
		this.preco = preco * 0.9;
		return preco;
	}
}
