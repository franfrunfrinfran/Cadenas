package es.Studium.Cadenas;

import java.util.Scanner;

public class Ejercicio10_Comparar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String palabra1, palabra2;
		int resultado;
		
		System.out.println("Escriba una palabra");
		palabra1=teclado.nextLine();
		
		System.out.println("Escriba otra palabra");
		palabra2=teclado.nextLine();
		
		resultado=palabra1.compareTo(palabra2);
		
		if (palabra1.compareTo(palabra2)>0) {
			System.out.println(resultado+"La palabra 1 es alfabeticamente mayor");
		}
		if (palabra1.compareTo(palabra2)==0) {
			System.out.println(resultado+"La palabra 1 es alfabeticamente igual");
		}
		if (palabra1.compareTo(palabra2)<0) {
			System.out.println(resultado+"La palabra 1 es alfabeticamente menor");
		}
		
		teclado.close();
	}

}
