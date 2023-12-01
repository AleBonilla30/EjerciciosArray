import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        int[] guardar= new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Introduzca los numeros:");
            guardar[i]= num.nextInt();

            if (guardar[i]%2==0){
                System.out.println("Es par "+guardar[i]);
            } else{
                System.out.println("El numero es impar "+guardar[i]);
            }

        }

    }
}
