package Condicionales;

import java.util.Scanner;

public class EjercicioPractico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double cantidadPrestamo = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("introduzca la cantidad del préstamo");
		cantidadPrestamo = scanner.nextDouble();
		
		while(cantidadPrestamo>0) {
			System.out.println("introduzca aportación");
			
			double aportacion = scanner.nextDouble();
			cantidadPrestamo = cantidadPrestamo - aportacion;
			System.out.println("cantidad del prestamo = "+ cantidadPrestamo );
		}
		System.out.println("has saldado tu deuda");
		
	}

}
