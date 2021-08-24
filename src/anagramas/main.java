package anagramas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class main {
//https://www.youtube.com/watch?v=YkRB1c8ucGs

	public static void main(String[] args) {

		tratarFichero david = new tratarFichero();
		 david.leerArchivo("D:/wordlist.txt");
		//david.comprobarPalabra("D:/descargado2020.txt");



	}
}
