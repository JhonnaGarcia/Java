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

           //Impresion Del Array

           System.out.println("El array quedo de la siguiente manera: \n");

           for(int i = 0; i < array.length; i++){

                System.out.println("Posicion: " + i + " Valor: " + array[i]);

           }        

        }

}