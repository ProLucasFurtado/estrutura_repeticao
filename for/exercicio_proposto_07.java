import java.util.Scanner;

/* 07) Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na
tela N linhas, come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado
e o cubo do valor, conforme exemplo.*/

public class exercicio_proposto_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (double i=1;i<=N;i++) {
			
			System.out.printf("%.0f ",i);
			System.out.printf("%.0f ",Math.pow(i, 2));
			System.out.printf("%.0f ",Math.pow(i, 3));
			System.out.println("");
		}
		
		sc.close();
	}

}
