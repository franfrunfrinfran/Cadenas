package es.Studium.Cadenas;

import java.util.Scanner;

public class Ejercicio8_subcadena {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nom1;
		int longitud, pos,  aux;
		
		
		System.out.println("Indique una frase:");
		nom1=teclado.nextLine();
		
		System.out.println("Indique la posicion con la que empieza la subcadena (<0):");
		pos=teclado.nextInt();
		aux=nom1.length();
		System.out.println("Indique la longitud de la subcadena (<"+aux+")");
		longitud=teclado.nextInt();
		
		System.out.println(subcadena(nom1, pos, longitud));
		teclado.close();
	}
	public static String subcadena(String nom1, int posIni, int longi) {
		return (nom1.substring(posIni-1,(posIni+longi-1)));
	}
}