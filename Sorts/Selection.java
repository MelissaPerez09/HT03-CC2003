package Sorts;
/**
 * Universidad del Valle de Guatemala
 * @author Jimena Hernández/21199 Mark Albrand/21004 Emily Pérez/21385
 * @version 25/02/2022
 * Algoritmos y estructuras de Datos HDT3
 *
 * Selection.java
 * Clase Selection que ordena un array de enteros con el algoritmo Selection Sort
 */

public class Selection extends Sort{

    public void selectionSort(int datos[], int size){
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
    }
}
