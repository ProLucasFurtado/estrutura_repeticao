import java.util.Locale;
import java.util.Scanner;

/* 04) Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro
pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */

public class exercicio_proposto_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double primeiro, segundo, divisao;
		for (int i=0; i<n;i++) {
			
			primeiro = sc.nextDouble();
			segundo = sc.nextDouble();
			
			if(segundo == 0) {
				System.out.println("Divis�o imposs�vel!!!");
			}
			else {
				divisao = primeiro/segundo;
				System.out.println(divisao);
			}
			
		}
		
		sc.close();
		
	}

}
