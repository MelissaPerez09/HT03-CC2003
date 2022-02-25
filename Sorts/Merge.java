package Sorts;
/**
 * Universidad del Valle de Guatemala
 * @author Jimena Hernandez/21199 Mark Albrand/21004 Emily Perez/21385
 * @version 25/02/2022
 * Algoritmos y estructuras de Datos HDT3
 *
 * Merge.java
 * Clase Merge que ordena un array de enteros con el algoritmo Merge Sort
 */

public class Merge extends Sort{

  public void merge (int datos[], int izquierda, int medio, int derecha){
    int num1 = medio - izquierda + 1;
    int num2 = derecha - medio;

    int izq[] = new int[num1];
    int der[] = new int[num2];

    for (int i = 0; i < num1; ++i){
      izq[i] = datos[izquierda + i];
    }
    for (int j = 0; j < num2; j++){
      der[j] = datos [medio + 1 +j];
    }

    int i = 0;
    int j = 0;

    int k = izquierda;
    while (i < num1 && j < num2){
      if (izq[i] <= der[j]);{
        datos[k] = izq[i];
        i++;
      }{
      datos[k] = der[j];
      j++;
      }
      k++;
    }

    while (i < num1){
      datos[k] = izq[i];
      i++;
      k++;
    }

    while (j < num2){
      datos[k] = der[j];
      j++;
      k++;
    }
  }

  void sort (int datos[], int izquierda, int derecha){
    if (izquierda < derecha){
      int medio = izquierda + (derecha - 1) / 2;

      sort(datos, izquierda, medio);
      sort(datos, medio + 1, derecha);

      merge(datos, izquierda, medio, derecha);
    }
  }

  public void mergesort(int datos[], int izquierda, int medio, int derecha){
    merge(datos, izquierda, medio, derecha);
    mensaje("\n A continuation se mostraran los numeros ordenados por MergeSort:");
    printArray(datos);
  }
}