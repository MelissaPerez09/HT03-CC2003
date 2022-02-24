package Sorts;

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
