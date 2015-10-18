package net.aladinidrissi.buscaNums;

import java.util.Random;
import java.util.Scanner;

public class BuscaNums {
	public static void main(String[] args) {

		Random r = new Random(); 
		Scanner lector = new Scanner(System.in);
		
		Boolean existeix = false; 
		String mostraArray = ""; 
		
		int num; 
		int array[] = new int[1000]; 
		System.out.print("Insereix el numero a buscar: "); 
													
		num = lector.nextInt(); 
		for (int i = 0; i < 1000; i++) { 
			
			array[i] = (int) (r.nextDouble()*1000); 
			mostraArray += " " + array[i]; 
			
			if (array[i] == num) { 
				existeix = true; 
			}
		}
		System.out.println(mostraArray); 
		if (existeix == true) {
			System.out.println("El numero es troba dins l'array");
		} else { 
			System.out.println("El numero no es troba a l'array");
		}System.out.println("Ha trigat " + System.nanoTime() + " nanosegons a executar-se.") ;
		lector.close();
	}
}
