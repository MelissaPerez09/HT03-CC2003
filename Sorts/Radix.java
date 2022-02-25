package Sorts;
/**
 * Universidad del Valle de Guatemala
 * @author Jimena Hernandez/21199 Mark Albrand/21004 Emily Perez/21385
 * @version 25/02/2022
 * Algoritmos y estructuras de Datos HDT3
 *
 * Radix.java
 */

import java.util.*; 

public class Radix extends Sort{

    /**
     * Permite encontrar el maximo dato en el array
     * @param datos Array de data a ordenar
     * @param size  Tamaño del array a ordenar
     * @return
     * 
     */
    public int getMax(int datos[], int size){
        int mx = datos[0];
        for (int i = 1; i < size; i++)
            if (Compare(datos[i], mx)== 0) //Utilizando Compare 
                mx = datos[i];
        return mx;
    }

    /**
     * 
     * @param datos Array de data a ordenar
     * @param n     tamaño del array
     * @param exp   es 10^i  donde i es exp
     */
    public void countSort(int datos[], int n, int exp){
        int output[] = new int[n]; // array con el tamaño del array original
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);      //Rellenando de 0s el array
 
        for (i = 0; i < n; i++){
            count[(datos[i] / exp) % 10]++;
        }
 
        for (i = 1; i < 10; i++){
            count[i] += count[i - 1];
        }
 
        // Construyendo el array del output
        for (i = n - 1; i >= 0; i--) {
            output[count[(datos[i] / exp) % 10] - 1] = datos[i];
            count[(datos[i] / exp) % 10]--;
        }
 
        for (i = 0; i < n; i++){
            datos[i] = output[i];
        }
    }

    /**
     * funcion p, ordena los datos de tamaño n con Radix Sort
     * @param datos
     * @param n
     */
    public void radixsort(int datos[], int n){
        // Encontrando el max
        int m = getMax(datos, n);
 
        // Sort de conteo por cada digito, pasandole exp
        for (int exp = 1; m / exp > 0; exp *= 10){
            countSort(datos, n, exp);
        }
        
        mensaje("\n A continuacion se mostraran los numeros ordenados por Radix Sort: \n");
        printArray(datos);
    }

 
    
}
