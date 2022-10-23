package calculadora;

import java.util.Scanner;

public class Soma implements Operacao {

	private double n1, n2, result;
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void calcular() {
		result = n1 + n2;
		System.out.println("Resultado: " + result);
		
	}

	@Override
	public void pedirValores() {
		
		System.out.println("Insira o primeiro valor para a operação de soma");
		n1 = sc.nextDouble();
		
		System.out.println("Insira o segundo valor para a operação de soma");
		n2 = sc.nextDouble();
	}
}
