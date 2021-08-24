package anagramas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class tratarFichero {
	public void leerArchivo(String ruta) {

		FileReader fr = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader(ruta); // creo objeto
			br = new BufferedReader(fr); // necesita un objeto FileReader
			String linea = "";
		
			bw = new BufferedWriter(new FileWriter("d:/descargado2022.txt"));

			while (linea != null) {

				linea = br.readLine(); // leemos la linea y se almacena en "contenido" para luego mostrarlo

				linea = linea.toLowerCase().replaceAll("[^A-Za-z0-9]", ""); // elimino todos los caracteres raros

				char[] caracteres = linea.toCharArray();
				Arrays.sort(caracteres); // ordenas los caracteres
				String nuevaPalabra = String.join("", String.copyValueOf(caracteres)); // transformo Char a String

				if (nuevaPalabra.length() > 0) {
					bw.write(nuevaPalabra + "\n");// para q cada palabra ocupe una linea
				}
				System.out.println("fichero generandose");

			}

		} catch (FileNotFoundException ex) {
			System.out.println("archivo no encontrado en la ruta indicada");
		} catch (IOException ex) {
			System.out.println("error en el fichero al procesar los datos:" + ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.println("error con exception Null Pointer Fin fichero:" + ex.getMessage());
		}finally {
			// cierro el fichero abierto
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				System.out.println("error en el fichero al procesar los datos:" + e.getMessage());
			}
		}

	} // leer archivo

	public void comprobarPalabra(String ruta) {

		// filereader: es para leer, tiene dos constructores
		// buffered es mas eficiente q fileReader
		FileReader fr = null;
		FileReader fr2 = null;
		BufferedReader br = null;
		BufferedReader br2 = null;

		try {
			fr = new FileReader(ruta); // creo objeto
			fr2 = new FileReader(ruta); // creo objeto
			br = new BufferedReader(fr); // necesita un objeto FileReader
			br2 = new BufferedReader(fr2);
			String linea = "";

			while ((linea = br.readLine()) != null) { // leo la primera linea
				String linea2 = "";
				int contador = -1;
				System.out.println("valor a buscar1 " + linea);
				while ((linea2 = br.readLine()) != null) {

					System.out.println("valor a buscar2 " + linea2);
					if (linea.equals(linea2)) {
						System.out.println(linea + "coincide con " + linea2);
						contador++;
					}

				}
				// System.out.println("la palabra: " + linea2 + " ES anagrama " + contador +
				// "veces en el fichero");
			}

		} catch (FileNotFoundException ex) {
			System.out.println("archivo no encontrado en la ruta indicada");
		} catch (IOException ex) {
			System.out.println("error en el fichero al procesar los datos:" + ex.getMessage());
		} finally {
			// cierro el fichero abierto
			try {
				br.close();

			} catch (IOException e) {
				System.out.println("error en el fichero al procesar los datos:" + e.getMessage());
			}
		}

	} // comprobar palabra

} // clase
