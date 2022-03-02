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

  void merge(int arr[], int l, int m, int r)
  {
    // Find sizes of two subarrays to be merged
    int n1 = m - l + 1;
    int n2 = r - m;

    /* Create temp arrays */
    int L[] = new int[n1];
    int R[] = new int[n2];

    /*Copy data to temp arrays*/
    for (int i = 0; i < n1; ++i)
      L[i] = arr[l + i];
    for (int j = 0; j < n2; ++j)
      R[j] = arr[m + 1 + j];

    /* Merge the temp arrays */

    // Initial indexes of first and second subarrays
    int i = 0, j = 0;

    // Initial index of merged subarray array
    int k = l;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      }
      else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    /* Copy remaining elements of L[] if any */
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    /* Copy remaining elements of R[] if any */
    while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
    }
  }

  // Main function that sorts arr[l..r] using
  // merge()
  void sort(int arr[], int l, int r)
  {
    if (l < r) {
      // Find the middle point
      int m =l+ (r-l)/2;

      // Sort first and second halves
      sort(arr, l, m);
      sort(arr, m + 1, r);

      // Merge the sorted halves
      merge(arr, l, m, r);
    }
  }

  /**
   * Metodo para imprimir un mensaje despues del ordenamiento
   * @param datos Array para ordenar
   * @param izquierda Dato de la posicion izquierda
   * @param medio Dato de la posicion medio
   * @param derecha Dato de la posicion derecha
   */
  public void mergesort(int datosOriginales[], int izquierda, int derecha){

    int[] datos = new int[datosOriginales.length];
    System.arraycopy(datosOriginales, 0, datos, 0, datosOriginales.length);

    sort(datos, izquierda, derecha);
    mensaje("\n A continuacion se mostraran los numeros ordenados por MergeSort:");
    printArray(datos);
  }
}
