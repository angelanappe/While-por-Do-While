import java.util.Scanner;

public class SecuenciaFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cuántos números de la secuencia de Fibonacci quiere ver: ");
        int n = sc.nextInt();

        int primero = 0;
        int segundo = 1;
        System.out.println(primero);
        if (n > 1) {
            System.out.println(segundo);
        }
        for (int i = 2; i < n; i++) {
            int temp = primero + segundo;
            System.out.println(temp);
            primero = segundo;
            segundo = temp;
        }
    }
}
