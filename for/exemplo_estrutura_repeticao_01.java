import java.util.Scanner;

/*Fazer um programa que l� um valor inteiro N e depois N
n�meros inteiros. Ao final, mostra a soma dos N n�meros lidos*/

public class exemplo_estrutura_repeticao_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int soma = 0;
		
		for(int i=0; i < N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
 		System.out.println(soma);
		
		sc.close();
		
	}

}
