package Ex2;
//c)
import java.util.Scanner;

public class Corretora {
	int soma;
	public static void main(String[] args) {
		Imovel [] i = new Imovel[5];
		
		Scanner input = new Scanner(System.in);
		
		 i[0].preco = input.nextInt();
		//input.nextLine();
		 i[0].endereco = input.nextLine();

		 i[1].preco = input.nextInt();
		 i[1].endereco = input.nextLine();
	
		 i[2].preco = input.nextInt();
		 i[2].endereco = input.nextLine();
	
		 i[3].preco = input.nextInt();
		 i[3].endereco = input.nextLine();
	
		 i[4].preco = input.nextInt();
		 i[4].endereco = input.nextLine();
	}

}
