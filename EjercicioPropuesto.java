package Condicionales;

import java.util.Scanner;

public class EjercicioPropuesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ejercicio 1 https://irojasti.blogspot.com/2017/06/ejercicios-condicionales-java.html
		//  int num1,num2;
		//  Scanner entrada = new Scanner (System.in);
		   
		// System.out.println("Ingrese el primer numero: ");
		//   num1=entrada.nextInt();
		//  System.out.println("Ingrese el segundo numero");
		//   num2=entrada.nextInt();
		   
		//   if(num1>num2){
		//       System.out.println("El número mayor es: " + num1);
		//   }
		//   else{
		//       System.out.println("El mayor es: " + num2);
		//   }
		//   } 
	
		
		//ejercicio 2 https://irojasti.blogspot.com/2017/06/ejercicios-condicionales-java.html
		 
		Scanner entrada=new Scanner(System.in);
	        System.out.print("Ingrese un numero: ");
	        int n1 = entrada.nextInt();
	        System.out.print("Ingrese un numero: ");
	        int n2 = entrada.nextInt();
	        System.out.print("Ingrese un numero: ");
	        int n3 = entrada.nextInt();
		 
	       if((n1>n2)&&(n2>n3)){
	            System.out.println("El orden es: " + n1 + n2 +n3);
	             }
	            else if((n1>n3)&&(n3>n2)){
	             System.out.println("El orden es: " + n1 + n3 +n2);       
	             }
	            else if((n2>n1)&&(n1>n3)){
	            System.out.println("El orden es: " + n2 + n1 +n3);
	            }
	            else if((n2>n3)&&(n3>n1)){
	            System.out.println("El orden es: " + n2 + n3 +n1);
	            }
	            else if((n3>n2)&&(n2>n1)){
	            System.out.println("El orden es: " + n3 + n2 +n1); 
	            }
	        else{
	        System.out.println("El orden es: " + n3 + n1 +n2);
	        }
		
		
		

}
}

