package Sorts;
/**
 * Universidad del Valle de Guatemala
 * @author Jimena Hernández/21199 Mark Albrand/21004 Emily Pérez/21385
 * @version 25/02/2022
 * Algoritmos y estructuras de Datos HDT3
 *
 * Selection.java
 * Clase Gnome que ordena un array de enteros con el algoritmo Gnome Sort
 */

public class Gnome extends Sort {

    /**
     * Método principal para ordenar un array por medio de Gnome Sort
     * @param datos Array de los datos a ordenar
     * @param size Tamaño del array a ordenar
     */
    public void gnomeSort(int datos[], int size)
    {
        int index = 0;
 
        while (index < size) {
            if (index == 0)
                index++;
            if (Compare(datos[index], datos[index - 1]) == 0 || Compare(datos[index], datos[index - 1]) == -1  )
                index++;
            else {
                int temp = 0;
                temp = datos[index];
                datos[index] = datos[index - 1];
                datos[index - 1] = temp;
                index--;
            }
        }
        mensaje("\n A continuacion se mostraran los numeros ordenados por Gnome Sort: \n");
        printArray(datos);
        return;

    }
    
}
