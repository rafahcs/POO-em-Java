package ExercicioScanner;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Mochila [] m = new Mochila[4];
		int totalAnos = 0;
		int media = 0;
		for( int i = 0; i < 4; i++ ) {
		System.out.println("Insira a cor e o ano da mochila: ");
		String  cor  = scanner.nextLine();
		int ano = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Mochila " + (i+1) + ": " + cor + " ano: " + ano);
		m [i] = new Mochila(cor, ano);
		totalAnos = totalAnos + m[i].ano;
		scanner.close();
		}
		media = totalAnos / 4;
		System.out.println("Media dos anos das mochilas: " + media);
	}

}
