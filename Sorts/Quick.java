package Sorts;

public class Quick extends Sort{
    
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


    public void sort(int datos[], int izquierda, int derecha) {
        if (Compare(izquierda, derecha) == 1) {
            int indiceParticion = particion(datos, izquierda, derecha);
            sort(datos, izquierda, indiceParticion);
            sort(datos, indiceParticion + 1, derecha);
        }
        
    }

    public void quicksort(int datos[], int izquierda, int derecha){
        sort(datos, izquierda, derecha);
        mensaje("\n A continuacion se mostraran los numeros ordenados por Quick Sort:");
        printArray(datos);
    }
    
}
