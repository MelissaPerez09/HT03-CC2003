import Sorts.Gnome;
import Sorts.Merge;
import Sorts.Quick;
import Sorts.Radix;
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
    private static Archivos archivo;

    public static void main(String[] args) {
        try{
             archivo = new Archivos("test.txt");
        }catch (Exception e){

        }
        int[] numbers = archivo.generarNumeros();

        Gnome gnomesort = new Gnome();
        Merge mergesort = new Merge();
        Quick quicksort= new Quick();
        Selection selectionsort = new Selection();
        Radix radixsort= new Radix();

        gnomesort.gnomeSort(numbers,  numbers.length);
        mergesort.mergesort(numbers, 0, (numbers.length/2), numbers.length -1);
        quicksort.quicksort(numbers, 0, numbers.length-1);
        selectionsort.selectionSort(numbers, numbers.length);
        radixsort.radixsort(numbers, numbers.length);

    }
}
