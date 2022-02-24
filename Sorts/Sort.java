package Sorts;

public class Sort implements IComparator <Integer>{
   
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

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println("\n");
    }

    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }
}