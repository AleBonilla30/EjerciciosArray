import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner numeros= new Scanner(System.in);
        int [] guardar= new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce los numeros:");
            guardar[i]= numeros.nextInt();
        }
        System.out.println("Los numeros introducidos son:");
        for (int item :guardar) {
            System.out.print("\t"+item);
        }
    }
}
