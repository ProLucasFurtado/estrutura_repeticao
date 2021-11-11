import java.util.Locale;
import java.util.Scanner;

/*Fa�a um programa para ler um n�mero indeterminado
de dados, contendo cada um, a idade de um indiv�duo.
O �ltimo dado, que n�o entrar� nos c�lculos, cont�m
um valor de idade negativa. Calcular e imprimir a
idade m�dia deste grupo de indiv�duos. Se for entrar
um valor negativo na primeira vez, mostrar a mensagem
"Imposs�vel calcular".*/

public class exercicio_youtube_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont = 0, idade = sc.nextInt();
		
		double soma = 0, media = 0;
		
		while (idade >= 0) {
			
			cont += 1;
			soma += idade;
			media = soma/cont;
			idade = sc.nextInt();
		}
		
		if(idade < 0) {
			System.out.println("imposs�vel calcular");
			System.exit(0);
			}
		System.out.printf("%.2f%n",media);
		
		sc.close();

	}

}
