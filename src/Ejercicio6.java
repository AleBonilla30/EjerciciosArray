public class Ejercicio6 {
    public static void main(String[] args) {
        int[] num= new int[20];
        for (int i = 0; i < num.length; i++) {
            num[i]= (int) (Math.random()*31);
            System.out.print(num[i]+" ");
            if (num[i]==6){
                num[i]=8;
                System.out.println("Numero modificado "+num[i]);
            } else if (num[i]==7) {
                num[i]=15;
                System.out.println("Numero modificado "+num[i]);
                
            } else if (num[i]==20) {
                num[i]=10;
                System.out.println("Numero modificado "+num[i]);
            }




        }
    }
}
