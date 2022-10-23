package calculadora;

public abstract class FactoryMenu {
	public abstract menu() {
		int op = 0;
		
		do {System.out.println("Informe a operação desejada");
		System.out.println("1. Adição");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");
		System.out.println("5. Encerrar");
		
		
		switch(op) {
		case 1:
			return new Soma();
			
			break;
		
		case 2:
			return new Subtracao();
			break;
		
		case 3:
			return new Multiplicacao();
			break;
			
		case 4:	
			return new Divisao();
			break;
			
			
		}
		} while (op != 0);
	}
}
