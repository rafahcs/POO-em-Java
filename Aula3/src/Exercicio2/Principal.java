package Exercicio2;

public class Principal {

	public static void main(String[] args) {
		Utils u = new Utils();
		double media1 = u.calculaMedia(2, 3);
		System.out.println(media1);
		
		double media2 = u.calculaMedia(10, 20, 30);
		System.out.println(media2);
		
		double media3 = u.calculaMedia(100, 200, 300, 400);
		System.out.println(media3);
	}

}
