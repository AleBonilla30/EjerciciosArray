public class Ejercicio2 {

    public static void main(String[] args) {

       int [] numeros= new int[30];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)(Math.random()*11);
        }
        System.out.println("---------Numeros generados---------");
        for (int item:numeros) {
            System.out.print("\t"+item);
        }
        System.out.println();
        int totalPuntos=0;
        for (int total:numeros) {
            totalPuntos += total;
        }
        double media= (double) totalPuntos/numeros.length;
        System.out.println("Numero de puntos obtenidos "+totalPuntos);
        System.out.println("Numero de media de puntos obtenido "+media);

    }
}
