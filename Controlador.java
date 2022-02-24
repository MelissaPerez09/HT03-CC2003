import Sorts.Gnome;
import Sorts.Quick;

/**
 * Universidad del Valle de Guatemala
 * @author Jimena Hernández/21199 Mark Albrand/21004 Emily Pérez/21385
 * @version 25/02/2022
 * Algoritmos y estructuras de Datos HDT3
 * 
 * Controlador.java 
 * main del programa
 */

public class Controlador{
    public static void main(String[] args) {
        Gnome gnomesort = new Gnome();
        Quick quicksort= new Quick();
        int[] numbers = {10,24,30,87,2,3};

        gnomesort.gnomeSort( numbers,  6 );
        quicksort.quicksort(numbers, 0, 5 );
    }
}
