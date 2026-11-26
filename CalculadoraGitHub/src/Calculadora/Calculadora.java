package Calculadora;

class Calculadora {

	public static double sumar(double a, double b) {
		return a + b;
	}
	
	public static double restar(double a, double b) {
		return a - b;
	}
	
	public static double multiplicar(double a, double b) {
		return a * b;
	}
	
	public static double dividir(double a, double b) {
	    if (b == 0) {
	        System.out.println("Error: No se puede dividir por cero.");
	        return 0.0;
	    }
	    return a / b;
	}
	
	public static double potencia(double base, int exponente) {
		return Math.pow(base, exponente);
	}

	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}
	
	public static void main(String[] args) {
		System.out.println("Calculadora GitHub");
		System.out.println("Suma: " + sumar(8, 4));
	}
		 
}