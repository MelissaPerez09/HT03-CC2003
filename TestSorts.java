import Sorts.*;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestSorts {

    @Test
    public void TestGnome(){
        int[] ordenado= {2,6,8,20,50,100,5000};
        int[] desordenado= {5000,50,100,8,2,6,20};
        Gnome gnomesort = new Gnome();
        desordenado = gnomesort.gnomeSort(desordenado,desordenado.length);
            for (int i = 0; i < desordenado.length ; i++) {
                assertEquals(desordenado[i], ordenado[i] );
            }
    }

    @Test
    public void TestRadix(){
        int[] ordenado= {2,6,8,20,50,100,5000};
        int[] desordenado= {5000,50,100,8,2,6,20};
        Radix radixsort = new Radix();
        desordenado = radixsort.radixsort(desordenado, desordenado.length);
        for (int i = 0; i < desordenado.length ; i++) {
            assertEquals(desordenado[i], ordenado[i] );
        }
    }

    @Test
    public void TestMerge(){
        int[] ordenado= {2,6,8,20,50,100,5000};
        int[] desordenado= {5000,50,100,8,2,6,20};
        Merge mergesort = new Merge();
        desordenado = mergesort.mergesort(desordenado, 0, desordenado.length-1);
        for (int i = 0; i < desordenado.length ; i++) {
            assertEquals(desordenado[i], ordenado[i] );
        }
    }

    @Test
    public void TestSelection(){
        int[] ordenado= {2,6,8,20,50,100,5000};
        int[] desordenado= {5000,50,100,8,2,6,20};
        Selection selectionsort= new Selection();
        desordenado= selectionsort.selectionSort(desordenado,desordenado.length);
        for (int i = 0; i < desordenado.length ; i++) {
            assertEquals(desordenado[i], ordenado[i] );
        }
    }

    @Test
    public void TestQuick(){
        int[] ordenado= {2,6,8,20,50,100,5000};
        int[] desordenado= {5000,50,100,8,2,6,20};
        Quick quicksort= new Quick();
        desordenado= quicksort.quicksort(desordenado, 0, desordenado.length-1);
        for (int i = 0; i < desordenado.length ; i++) {
            assertEquals(desordenado[i], ordenado[i] );
        }
    }
}