//Exercicio3
public class SomaImpares {

	public static void main(String[] args) {
		int impar = 0;
		int soma = 0;
		for(int i = 1; i < 10000; i++) {
			if( i%2 != 0 ) {
				impar = i; //soma = soma +i
				soma = soma + impar; 
			} 
		}
		System.out.println(soma);
	}

}
