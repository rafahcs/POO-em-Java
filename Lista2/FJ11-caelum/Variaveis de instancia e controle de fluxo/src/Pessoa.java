
public class Pessoa {
	int idade;
	String nome;
	public void fazAniversario() {
		while( idade < 25 ) {
		idade++;
		}
	System.out.println(nome + " tem " + idade + " anos" );
	}
}