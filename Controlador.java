import Sorts.Gnome;
import Sorts.Merge;
import Sorts.Quick;
import Sorts.Selection;

/**
 * Universidad del Valle de Guatemala
 * @author Jimena Hernandez/21199 Mark Albrand/21004 Emily Perez/21385
 * @version 25/02/2022
 * Algoritmos y estructuras de Datos HDT3
 * 
 * Controlador.java 
 * main del programa
 */

public class Controlador{
    public static void main(String[] args) {
        int[] numbers = {10,24,30,87,2,3,14};

        Gnome gnomesort = new Gnome();
        Quick quicksort= new Quick();
        Selection selectionsort = new Selection();
        Merge mergesort = new Merge();

        gnomesort.gnomeSort( numbers,  7 );
        quicksort.quicksort(numbers, 0, 6 );
        selectionsort.selectionSort(numbers, numbers.length);
        mergesort.mergesort(numbers, 0, 6, numbers.length -1);
    }
}
