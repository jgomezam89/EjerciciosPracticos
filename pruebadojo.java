package academia19e37;

import java.util.Scanner;

public class pruebadojo {

	static int a;
	
	static int puntos = 0;
	static int total = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		a = (int)(Math.random()*10 + 1);
		System.out.println("El empezar a vale " + a);
		
	
		a = a + 5;
		int b = a;
		a = b + 2 * a;
	
		int c = b / 2;
		a = c + a;
		a = (a + b) % c;
	
		a = a / 3;		
	

		a++;
		b = 7 * a++;
		a -= 2;
		c = 3 * --a;
		comprobar();
		

		if (a < 25){
			if ( (a > 10) && (b < 20) )
					a = 50;
			else
				a = 10;
		}
		else{
			if ( (a < 75) || (b > 50) )
				a = 30;
			else
				a =20;
		}

		

		for (int i = 0; i < 4; i++)
			a = a + i;
		comprobar();
		while (c > 0){
			a = a + 2;
			c -= 10;
		}

		
	
		a = metodo1(a);
		comprobar();
		metodo2(a);
		comprobar();
		metodo3(a);
		comprobar();
		a = metodoRecursivo(a);
		comprobar();
		
		sc.close();
		System.out.println("¡FIN! Has conseguido, " + puntos + " puntos de " + total + ".");
	}

	private static int metodo1(int b) {
		return b + 2;
	}

	private static void metodo2(int a) {
		a = 17;
	}
	
	private static void metodo3(int c) {
		a = 17;
	}
	
	private static int metodoRecursivo(int d) {
		if (d <= 0)
			return 0;
		return d + metodoRecursivo(d-10);
	}

	static void comprobar() {
		total++;
		System.out.print("¿Cuanto vale a? ");
		if (sc.nextInt() != a){
			System.out.println("¡LO SIENTO! a vale " + a);
			System.out.println("Sigues con " + puntos + " puntos de " + total + ".");
		}
		else{
			puntos++;
			System.out.println("¡BIEN! Llevas " + puntos + " puntos de " + total + ".");
		}
	}

}