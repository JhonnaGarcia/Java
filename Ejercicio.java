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

           //Ordenar El Array

           int temp;

           for(int j = 0; j < array.length - 1; j++){

               for (int i = 0; i < array.length - 1; i++){

                    if (array[i] > array[i + 1]) {

                        temp = array[i];

                        array[i] = array[i + 1];

                        array[i + 1] = temp;


                    }

               }


           }

           
            //Impresion Array Ordenado

           System.out.println("Impresion Del Array Ordenado: \n");

           for(int i = 0; i < array.length; i++){

                   System.out.println("Posicion: " + i + " Valor: " + array[i]);

               }        

        }

}