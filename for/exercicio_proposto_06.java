import java.util.Scanner;

/* 06) Ler um n�mero inteiro N e calcular todos os seus divisores*/

public class exercicio_proposto_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			
			if(N%i == 0) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
