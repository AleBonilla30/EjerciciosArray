public class Ejercicio4 {
    public static void main(String[] args) {
        /*4. Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100.
    - En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
    - En el array cubo se deben almacenar los cubos de los valores que hay en numero.
    -Una ver realizado lo anterior muestra el contenido de los tres arrays dispuesto en tres columnas.*/

        int [] numero= new int[20];
        int[] cuadrado= new int[20];
        int [] cubo= new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i]= (int)(Math.random()*100);
            cuadrado[i]= numero[i]*numero[i];
            cubo[i]= (int) (Math.pow(numero[i],3));

        }  System.out.printf("%-10s %-10s %-10s\n", "Numero", "cuadrado", "cubo");
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%-10d %-10d %-10d\n", numero[i], cuadrado[i], cubo[i]);

        }
    }
}
