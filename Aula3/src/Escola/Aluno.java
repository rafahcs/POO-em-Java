package Escola;

public class Aluno {
	private String nome;
	private float nota1;
	private float nota2;
	
	
	public void nota(float nota1, float nota2){
		if(nota1 < 0) {
			this.nota1 = 0;
		}
		if (nota2 < 0) {
			this.nota2 = 0;
		}
		if(nota1 > 10) {
			this.nota1 = 10;
		}
		if(nota2 > 10) {
			this.nota2 =10;
		}
	}
	
	public String situação(float nota1, float nota2){
		float media = (this.nota1 + this.nota2) / 2;
		
		if(media >= 4 && media <= 5.9) {
			return "Em Recuperação";
	}
		if
	}
}
