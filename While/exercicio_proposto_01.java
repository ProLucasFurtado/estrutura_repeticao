import java.util.Scanner;

/* 01) Escreva um programa que repita a leitura de uma senha
at� que ela seja v�lida. Para cada leitura de senha incorreta
informada, escrever a mensagem "Senha Invalida". Quando a senha
for informada corretamente deve ser impressa a mensagem "Acesso
Permitido" e o algoritmo encerrado. Considere que a senha correta
� o valor 2002.*/

public class exercicio_proposto_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inv�lida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		sc.close();
		
	}

}
