package es.Studium.Cadenas;

import java.util.Scanner;

public class Ejercicio9_Subcadena2 {
	
	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	
	String nom1;
	int numCaracter;
	int posInicio;
	//Solicitar Datos
	
	System.out.println("Escriba un texto");
	
	nom1=teclado.nextLine();
	System.out.println("Indique cantidad de caracteres a recuperar entre 1 y"+nom1.length());
	numCaracter=teclado.nextInt();
	
	//calcular la posicion (el indice) desde comenzar a extraer la cadena
	posInicio=nom1.length()-numCaracter;
	//mostrar info en pantalla
	System.out.println("Indice+caracter");
		for (int i=0;i<nom1.length();i++) {
			System.out.println(i+"*"+nom1.charAt(i));
		}
		System.out.println("Longitud= "+nom1.length());
		System.out.println("Cantidad Caracteres= "+numCaracter);
		System.out.println("Posicion inicial (indice)=longitud-numero.caracteres");
	//Obtener resultado
		System.out.println(nom1.substring(posInicio,nom1.length()));

	teclado.close();
}}
