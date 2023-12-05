import java.util.Scanner;

public class Ejercicio1_multi {
    public static void main(String[] args) {
        Scanner elemento= new Scanner(System.in);
        int [] guardado= new int[5];
        for (int i = 0; i < guardado.length; i++) {
            System.out.println("Introduce numeros: ");
            guardado[i]= elemento.nextInt();

        }

        int suma= 0;
        for (int numero : guardado) {
          suma += numero*2;

        }
        double media = (double) suma / guardado.length;
        System.out.println("La suma de los numero es: "+suma);
        System.out.println("la media de los numero es: "+media);

    }
}
