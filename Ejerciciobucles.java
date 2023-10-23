package Condicionales;

import java.util.Scanner;

public class Ejerciciobucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num1,num2;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("introduzca el primer numero");
//		num1 = scanner.nextInt();
//		System.out.println("introduzca el segundo numero");
//		num2 = scanner.nextInt();
//
//		for (int i= num1; i<= num2;i++) {
//		double resultado = i%2;
//		if (resultado ==0) {
//			System.out.println(i);
//		}
//				
//		}
		
		
//		String letra;
//		System.out.println("introduzca un caracter");
//		Scanner scanner = new Scanner (System.in);
//		letra = scanner.next();
//		
//		while (!letra.equals(" ")) {
//			if (letra.equals("a")|| letra.equals("e")|| letra.equals("i")||letra.equals("o")||letra.equals("u")) {
//				System.out.println("es una vocal");
//			}
//			else {
//				System.out.println("no es una vocal");
//			}
//			System.out.println("introduzca un caracter");
//			letra = scanner.next();
//		}
//		
//		int numero = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("introduzca numero");
//		
//		numero = scanner.nextInt();
//		int resultado = numero;
//		for(int i=numero-1; i>0; i--) {
//			resultado = resultado * i;
//		}
//	System.out.println("resultado:"+ resultado);	
		
		
//		int numero = 0;
//		Scanner scanner = new Scanner(System.in);
//		int suma = 0;
//		
//		for (int i = 0; i<5; i++) {
//			System.out.println("introduzca un numero");
//			numero = scanner.nextInt();
//			suma = suma + numero;	
//		}
//		System.out.println("mostrar resultado" + suma);
		
		
		
//		int num1, num2;
//		Scanner scanner= new Scanner(System.in);
//		System.out.println("introduzca un numero");
//		num1=scanner.nextInt();
//		System.out.println("introduzca el segundo numero");
//		num2=scanner.nextInt();
//		
//		for(int i = num1; i<num2; i++){
//		double	resultado = i%2;
//		if (resultado ==0) {
//			System.out.println(i + " ES PAR");
//		
//		}
//		else {
//			System.out.println(i + " ES IMPAR");
//	
//		}
//		
//		}
		
		int renta;
		Scanner scanner = new Scanner(System.in);
		System.out.println("introduzca cantidad");
		renta = scanner.nextInt();
		
		if (renta<10000) {
			System.out.println("5%");
		}
		else if (renta>= 10000 && renta<20000) {
			System.out.println("15%");
		}
		else if (renta>=20000 && renta<35000) {
			System.out.println("20%");
		}
		else if (renta>=35000 && renta<60000) {
			System.out.println("30%");
		}
		else {
			System.out.println("45%");
		}
	}

}
        