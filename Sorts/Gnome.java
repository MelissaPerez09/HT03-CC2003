package Sorts;
/**
 * Universidad del Valle de Guatemala
 * @author Jimena Hernandez/21199
 * @author Mark Albrand/21004
 * @author Emily Perez/21385
 * * @version 25/02/2022
 * Algoritmos y estructuras de Datos HDT3
 *
 * Selection.java
 * Clase Gnome que ordena un array de enteros con el algoritmo Gnome Sort
 */

public class Gnome extends Sort {

    /**
     * Metodo principal para ordenar un array por medio de Gnome Sort
     * @param datosOriginales Array de los datos a ordenar
     * @param size Tamano del array a ordenar
     * @return Datos ordenados
     */
    public int[] gnomeSort(int datosOriginales[], int size){
        // Copia de los datos originales, para no alterar el array original
        int[] datos = new int[datosOriginales.length];
        System.arraycopy(datosOriginales, 0, datos, 0, datosOriginales.length);

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
        return datos;

    }
    
}
