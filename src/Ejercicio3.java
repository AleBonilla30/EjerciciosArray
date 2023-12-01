import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner programa= new Scanner(System.in);
        int[] guardar= new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce los numeros:");
            guardar[i]= programa.nextInt();
        }
        System.out.println("Los numeros generados son: ");
        for (int num:guardar) {
            System.out.print("\t"+num);
        }
        System.out.println();
        System.out.println("Los numeros inversos son ");
        for (int i = guardar.length-1; i >=0 ; i--) {
            System.out.print(guardar[i]+ "\t ");
        }



    }
}
