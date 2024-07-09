import java.util.Scanner;

public class ProgramaPrincipal {
	String color; 
	
	public static void main(String[] args) {
		
		int soma = 0;
		Mochila []m = new Mochila[4];
		/*m [0].cor = new String("azul");
		m [0].anoFabricacao = 2024;*/
		int x = 0;
		while( x < 4 ) {
		System.out.println("Insira a cor da mochila: ");
		Scanner scanner = new Scanner(System.in);
		m[x].cor = scanner.nextLine();
		System.out.println("Insira o ano de fabricação: ");
		m[x].anoFabricacao = scanner.nextInt();
		x++;
		}
		
		for(int i = 0; i < m.length; i++) {
			soma = soma + m[i].anoFabricacao;
		}
		
		System.out.println("Média dos anos de fabricação: " + soma / m.length);
		
		
	}

}
