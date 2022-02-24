package Sorts;

public class Gnome extends Sort {

    /**
     * 
     * @param datos
     * @param size
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
