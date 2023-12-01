import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String[] palabra= new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce las Palabras: ");
            palabra[i]= scanner.nextLine();

        }
        for (String item :palabra) {
            System.out.println();
            System.out.println(item+" ");
        }
        System.out.println("la palabra al azar es: "+palabra[4]);
        System.out.println();
        String palabraMasLarga= palabra[0];
        String palabraMasCorta= palabra[0];

        for (String palab:palabra) {
            if (palabra.length > palabraMasLarga.length()){
            palabraMasLarga= palab;
            }if (palab.length()< palabraMasCorta.length()){
                palabraMasCorta=palab;
            }

        }

        int totalLetras= 0;
        for (String total:palabra) {
            totalLetras += total.length();
        }
       double media= (double) totalLetras/ palabra.length;
        System.out.println("El numero total de letras es "+totalLetras);
        System.out.println("La media de letras es: "+media);
        System.out.println("La palabra mas larga es: "+palabraMasLarga);
        System.out.println("La palabra mas corta es: "+palabraMasCorta);

    }
}
