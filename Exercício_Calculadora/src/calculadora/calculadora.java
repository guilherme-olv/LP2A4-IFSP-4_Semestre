package calculadora;

public class calculadora {
	private double num1, num2, result;
	int opc;
	
	public double somar (double num1, double num2, double result) {
		result = num1 + num2;
				System.out.println("Resultado: " + result);
				return result;
	}
				
	public double subtrair (double num1, double num2, double result) {
		result = num1 - num2;
		System.out.println("Resultado: " + result);
		return result;
	}	
	public double multiplicar (double num1, double num2, double result) {
			result = num1 * num2;
			System.out.println("Resultado: " + result);
			return result;
	}		
	public double dividir (double num1, double num2, double result) {
				result = num1 / num2;
				System.out.println("Resultado: " + result);
				return result;											
				
				
		
	}
}
