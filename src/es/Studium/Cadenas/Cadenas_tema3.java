package es.Studium.Cadenas;

import java.util.Scanner;

public class Cadenas_tema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String nom1, nom2, nom3, nom4, nom5;
		
		System.out.println("Escriba un nombre");
		nom1=teclado.next();
		System.out.println("Escriba otro nombre");
		nom2=teclado.next();
		System.out.println("Escriba otro nombre");
		nom3=teclado.next();
		System.out.println("Escriba otro nombre");
		nom4=teclado.next();
		System.out.println("Escriba otro nombre");
		nom5=teclado.next();
		
		System.out.println(String.format("Las cadenas son %s, %s, %s, %s, %s", nom1, nom2, nom3, nom4, nom5));
		
		teclado.close();
	}

}
