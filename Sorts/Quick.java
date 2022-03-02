package Sorts;
/**
 * Universidad del Valle de Guatemala
 * @author Jimena Hernandez/21199 Mark Albrand/21004 Emily Perez/21385
 * @version 25/02/2022
 * Algoritmos y estructuras de Datos HDT3
 *
 * Quick.java
 * Clase Selection que ordena un array de enteros con el algoritmo Quick Sort
 */

public class Quick extends Sort{

    /**
     * Se encarga de dividir en particiones un arreglo, una vez el elemento de la izquierda supere al de la derecha
     * @param datos Array o particion a ordenar
     * @param izquierda Dato en la posicion izquierda
     * @param derecha Dato en la posicion derecha
     * @return Numero en donde se dara la siguiente particion
     */
    public int particion(int datos[], int izquierda, int derecha) {
        int pivote = datos[izquierda];
        // Ciclo infinito
        while (true) {
            while (Compare(datos[izquierda],pivote ) == 1) {
                izquierda++;
            }
            while (Compare(datos[derecha], pivote) == 0) {
                derecha--;
            }
            if (Compare(izquierda, derecha) == 0 ||Compare(izquierda, derecha) == -1 ) {
                return derecha;
            } else {
                int temporal = datos[izquierda];
                datos[izquierda] = datos[derecha];
                datos[derecha] = temporal;
                izquierda++;
                derecha--;
            }
            // El while se repite hasta que izquierda >= derecha
        }
    }


    /**
     * Metodo principal para el ordenamiento mediante recursividad
     * @param datos Array o particion a ordenar
     * @param izquierda Dato en la posicion izquierda
     * @param derecha Dato en la posicion derecha
     */
    public void sort(int datos[], int izquierda, int derecha) {
        if (Compare(izquierda, derecha) == 1) {
            int indiceParticion = particion(datos, izquierda, derecha);
            sort(datos, izquierda, indiceParticion);
            sort(datos, indiceParticion + 1, derecha);
        }
        
    }

    /**
     * Metodo para imprimir un mensaje despues de la finalizacion del ordenamiento.
     * @param datosOriginales Array o particion a ordenar
     * @param izquierda Dato en la posicion izquierda
     * @param derecha Dato en la posicion derecha
     */
    public int[] quicksort(int datosOriginales[], int izquierda, int derecha){
        // Copia de los datos originales, para no alterar el array original
        int[] datos = new int[datosOriginales.length];
        System.arraycopy(datosOriginales, 0, datos, 0, datosOriginales.length);

        sort(datos, izquierda, derecha);
        mensaje("\n A continuation se mostraran los numeros ordenados por Quick Sort:");
        printArray(datos);
        return datos;
    }
    
}
