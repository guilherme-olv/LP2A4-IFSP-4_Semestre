package calculadora;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
	    double n1, n2, result;
	    String sinalOperacao;
	    int op = 0;
	    Scanner sc = new Scanner(System.in);
	    do {
	    	System.out.println("Qual operação você deseja realizar?");
	    	System.out.println("1.Adição");
	    	System.out.println("2.Subtração");
	    	System.out.println("3.Multiplicação");
	    	System.out.println("4.Divisão");
	    	System.out.println("O.Encerrar");
	    	
	    	op = sc.nextInt();
	    	
	    	System.out.println("Digite o 1° valor: ");
	    	n1 = sc.nextDouble();
	    	
	    	System.out.println("Digite o 2° valor: ");
	    	n2 = sc.nextDouble();
	    	
	    	switch(op) {
	    	case 1:
	    		result = n1 + n2;
	    		sinalOperacao = "+";
	    		break;
	    	case 2:
	    		result = n1 - n2;
	    		sinalOperacao = "-";
	    		break;
	    	case 3:
	    		result = n1 * n2;
	    		sinalOperacao = "*";
	    		break;
	    	case 4:
	    		result = n1/n2;
	    		sinalOperacao = "/";
	    		break;
	    	case 0:
	    		sinalOperacao = "_";
	    		System.out.println("Programa encerrado.");
	    		System.exit(op);
	    		break;
	    	default:
	    		sinalOperacao = "_";
	    		System.out.println("Digite um valor válido.");
	    			
	    	}
	    	
	    	
	    } while (op!=0);
	}
	
	void imprimeResultado(n1  + sinalOperacao + n2, result) {
		System.out.println("O resultado da operação: " + n1  + sinalOperacao + n2 + 'é' + result);
	}

}
