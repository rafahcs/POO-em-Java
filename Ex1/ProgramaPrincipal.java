
public class ProgramaPrincipal {

	public static void main(String[] args) {
		System.out.println("Primeiro Programa");
		Cachorro a;
		a = new Cachorro();
		Cachorro b = new Cachorro();
		a.nome = "Pluto";
		b.nome = "Rex";
		a.idade = 20;
		b.raça = "labrador";
		
		System.out.println(a.nome + " " + a.idade + " " + a.raça);
		System.out.println(b.nome + " " + b.idade + " " + b.raça);
		
	}

}
