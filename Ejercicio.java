import java.util.Scanner;

public class Ejercicio{

        public static void main(String[] args){

           int[] array;

           Scanner captura = new Scanner(System.in);

           System.out.println("Tamano Del Array: ");

           array = new int[captura.nextInt()]; 

           System.out.println("Ingresa los datos del array: ");

           for (int i = 0; i < array.length; i++) {

                   array[i] = captura.nextInt();
                   
           }            

        }

}