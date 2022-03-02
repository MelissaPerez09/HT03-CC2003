package Sorts;
/**
 * Universidad del Valle de Guatemala
 * @author Jimena Hernandez/21199
 * @author Mark Albrand/21004
 * @author Emily Perez/21385
 * @version 25/02/2022
 * Algoritmos y estructuras de Datos HDT3
 *
 * Radix.java
 */

import java.util.*; 

public class Merge extends Sort{
	
	/**
   * Se encarga de dividir el arreglo identificando los elementos de la izquierda, derecha y medio
   * @param datos Array para ordenar
   * @param izquierda Dato de la posicion izquierda
   * @param medio Dato de la posicion medio
   * @param derecha Dato de la posicion derecha
   */
	void merge(int datos[], int izquierda, int medio, int derecha){
		//identifica el tamano de dos subarreglos
		int num1 = medio - izquierda + 1;
		int num2 = derecha - medio;
	  
		//crea arreglos temporales para el ordenamiento
		int L[] = new int[num1];
		int R[] = new int[num2];
	  
		//copia los datos en los arreglos temporales
		for (int i = 0; i < num1; ++i)
			L[i] = datos[izquierda + i];
		for (int j = 0; j < num2; ++j)
			R[j] = datos[medio + 1 + j];
	  
		//index para segundos subarreglos
		int i = 0, j = 0;
	  
		//realiza el merge en el subarreglo dentro del arreglo
		int k = izquierda;
		while (i < num1 && j < num2) {
			if (L[i] <= R[j]) {
				datos[k] = L[i];
					i++;
			}
			else {
				datos[k] = R[j];
				j++;
			}
			k++;
		}
	  
		//copia el arreglo 1 izquierdo
		while (i < num1) {
			datos[k] = L[i];
			i++;
			k++;
		}
	  
		//copia el arreglo 2 derecho
		while (j < num2) {
			datos[k] = R[j];
			j++;
			k++;
		}
	}
	  

	/**
   * Metodo que ordena los enteros por medio de recursividad
   * @param datos Array para ordenar
   * @param izquierda Dato de la posicion izquierda
   * @param derecha Dato de la posicion derecha
   */
	void sort(int datos[], int izquierda, int derecha){
		if (izquierda < derecha) {
			//encuentra la parte media del arreglo
			int medio =izquierda+ (derecha-izquierda)/2;
			
			//ejecuta el sort para las partes medias de la derecha e izquierda
			sort(datos, izquierda, medio);
			sort(datos, medio + 1, derecha);
	  
			//realiza el merge completo
			merge(datos, izquierda, medio, derecha);
		}
	}

	/**
	 * Método principal para el metodo Merge Sort, e imprime un mensaje
	 * @param datosOriginales Array para ordenar
	 * @param izquierda Dato de la posicion izquierda
	 * @param derecha Dato de la posicion derecha
	 * @return Datos ordenados
	 */
	public int[] mergesort(int datosOriginales[], int izquierda, int derecha) {
		// Copia de los datos originales, para no alterar el array original
		int[] datos = new int[datosOriginales.length];
		System.arraycopy(datosOriginales, 0, datos, 0, datosOriginales.length);
		sort(datos, izquierda, derecha);
		mensaje("\n A continuacion se mostraran los numeros ordenados por MergeSort:");
		printArray(datos);
		return datos;
	}
}
