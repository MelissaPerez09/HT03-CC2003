package Sorts;
/**
 * Universidad del Valle de Guatemala
 * @author Jimena Hernandez/21199
 * @author Mark Albrand/21004
 * @author Emily Perez/21385
 * @version 25/02/2022
 * Algoritmos y estructuras de Datos HDT3
 *
 * Sort.java
 * Clase sort que implementa la interfaz IComparator, para ser usada por los distintos algoritmos
 */


public class Sort implements IComparator <Integer>{

    /**
     * Metodo para comparar dos valores enteros
      * @param x Primer valor a comparar
     * @param y Segundo valor a comparar
     * @return Regresa 0 si el primer valor es mayor, 1 si es menor, -1 si son iguales
     */
    @Override
    public int Compare(Integer x, Integer y ){

        int res;

        if (x>y) {
            res = 0;
        }else if (x<y){
            res = 1;
        }else {
            res = -1;
        }
        return res;
    }

    /**
     * Metodo para imprimir un array
     * @param array Array a imprimir
     */
    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println("\n");
    }

    /**
     * Metodo para imprimir un mensaje en pantalla
     * @param mensaje Mensaje a imprimir
     */
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }
}