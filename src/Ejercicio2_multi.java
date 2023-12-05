import java.util.Scanner;

public class Ejercicio2_multi {
    public static void main(String[] args) {
        Scanner longitud= new Scanner(System.in);
        System.out.println("Introduce la longitud del array");
        int Long= longitud.nextInt();
        System.out.println("--------------------------------");
        System.out.println();
        int [] num= new int[Long];

        for (int i = 0; i < Long; i++) {
            System.out.println("Introduce los numeros de el array: ");
             num[i]=longitud.nextInt();

        }
        int mayor= num[0];
        int menor= num[0];
        for (int orden : num) {
            if (orden>mayor){
                mayor=orden;

            }
            if (orden<menor){
                menor=orden;
            }
        } System.out.println("El numero Mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);

    }
}
