//Exercício4
public class SomaCondicionada {

	public static void main(String[] args) {
		long soma = 0L;
		for(int i = 1; i <=50000; i++) {
			if (i >= 100 && i <= 137) {
                continue;
            }
			soma = soma + i;
		}
		System.out.println(soma);
	}

}
