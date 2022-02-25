import Sorts.Gnome;
import Sorts.Merge;
import Sorts.Quick;
import Sorts.Radix;
import Sorts.Selection;

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
    private static Archivos archivos;
    public static void main(String[] args) {
        int[] numbers = {10,24,30,87,2,3};
        try{
             archivos = new Archivos("test.txt");
        }catch (Exception e){

        }
        Gnome gnomesort = new Gnome();
        Merge mergesort = new Merge();
        Quick quicksort= new Quick();
        Selection selectionsort = new Selection();
        Radix radixsort= new Radix();

        gnomesort.gnomeSort( numbers,  6 );
        mergesort.mergesort(numbers, 0, 6, numbers.length -1);
        quicksort.quicksort(numbers, 0, 5 );
        selectionsort.selectionSort(numbers, numbers.length);
        radixsort.radixsort(numbers, numbers.length);

        int[] n = Archivos.generarNumeros(5);

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
