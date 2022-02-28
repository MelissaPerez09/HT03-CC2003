import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Archivos {
    private static File archivo;

    public Archivos(String nombre) throws IOException {
        archivo = new File(nombre);
        archivo.createNewFile();
    }

    public int[] generarNumeros(){
        int cantidad = 0;
        int[] nums = leer();
        Random rand = new Random();

        if(nums != null){
            return nums;
        }else {
            Scanner s = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de numeros a generar\n");
            cantidad = s.nextInt();
            nums = new int[cantidad];
        }

        for (int i = 0; i < cantidad; i++) {
            nums[i] = rand.nextInt(1999);
        }

        escribir(nums);
        return nums;
    }

    private void escribir(int[] arr){
        String linea = "";
        boolean resultado = false;

        for (int i = 0; i < arr.length; i++) {
            linea = linea + arr[i] + " ";
        }

        try{
            FileWriter fw = new FileWriter(archivo.getName(), true);
            fw.write(linea);
            fw.close();

        }catch (Exception e){

        }

    }

    private int[] leer(){
        int[] nums = null;
        String[] digits;
        try{
            Scanner scan = new Scanner(archivo);
            String linea = "";
            while (scan.hasNextLine()){
                linea = scan.nextLine();
                digits = linea.split(" ");

                nums = new int[digits.length];

                for (int i = 0; i < digits.length; i++) {
                    int n = Integer.parseInt(digits[i]);
                    nums[i] = n;
                }
            }

        }catch (Exception e){
            return null;
        }

        return nums;
    }

}
