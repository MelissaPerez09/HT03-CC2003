package Sorts;
/**
 * Universidad del Valle de Guatemala
 * @author Jimena Hernandez/21199 Mark Albrand/21004 Emily Perez/21385
 * @version 25/02/2022
 * Algoritmos y estructuras de Datos HDT3
 *
 * Selection.java
 * Clase Selection que ordena un array de enteros con el algoritmo Selection Sort
 */

public class Selection extends Sort{

    /**
     * Metodo principal para ordenar un array por medio de Selection Sort
     * @param datosOriginales Array de los datos a ordenar
     * @param size Tamano del array a ordenar
     * @return Datos ordenados
     */
    public int[] selectionSort(int datosOriginales[], int size){
        // Copia de los datos originales, para no alterar el array original
        int[] datos = new int[datosOriginales.length];
        System.arraycopy(datosOriginales, 0, datos, 0, datosOriginales.length);

        int sinOrdenar = size;
        int max;

        while (sinOrdenar > 0){
            max = 0;
            for(int i = 1; i < sinOrdenar; ++i){
                if(Compare(datos[max], datos[i]) == 1){
                    max = i;
                }
            }

            int temp = datos[max];
            datos[max] = datos[sinOrdenar - 1];
            datos[sinOrdenar - 1] = temp;
            sinOrdenar--;
        }

        mensaje("\n A continuacion se mostraran los numeros ordenados por Selection Sort: \n");
        printArray(datos);
        return datos;
    }
}
