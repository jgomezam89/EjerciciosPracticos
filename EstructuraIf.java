package Condicionales;

import java.util.Scanner;

public class EstructuraIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int hora = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("introduzca la hora");
//		hora = scanner.nextInt();
//		
//		if(hora >= 6 && hora<=12) {
//			System.out.println("buenos dias");
//			
//		}else if(hora>= 13 && hora <=20){
//			System.out.println("buenas tardes");
//		}else if(hora==21||hora==22 || hora==23 || hora==0 || hora== 1 || hora==2|| hora==3 || hora==4 || hora==5) {
//			System.out.println("buenas noches");	
//		}else {
//			System.out.println("la hora es incorrecta");
//		}
		
		//estructura switch
		
		int dia = 0;
		System.out.println("introduzca dia de la semana");
		Scanner scanner = new Scanner(System.in);
		dia = scanner.nextInt();
		
		switch (dia) {
		case 1: {
			System.out.println("lunes");
			break;
		}case 2:{
			System.out.println("martes");
			break;
			}
		case 3:{
			System.out.println("miercoles");
			break;
		}case 4:{
			System.out.println("jueves");
			break;
		} case 5:{
			System.out.println("viernes");
			break;
		}case 6: {
			System.out.println("sabado");
			break;
		} case 7: {
			System.out.println("domingo");
			break;
			
		}
		default:
			System.out.println("el numero debe estar entre 1 y 7");
			
		}
	
		
	}

}
