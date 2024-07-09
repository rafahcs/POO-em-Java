
public class Principal {

	public static void main(String[] args) {
		
		int a[] = new int[20];
		for(int i = 0; i < 20; i++) {
			a[i] = i + 1;
		}
		new Principal().inverte(a);
		for(int y = 0; y < 20; y++) {
			System.out.println(a[y]);
		}
	}
	public void inverte(int a[]) {
		int aux;
		for ( int x = 0; x < a.length/2; x++) {
			aux = a[x];
			a[x] = a[a.length - x - 1];
			a[a.length - x - 1] = aux;
		}
		
	}

}
