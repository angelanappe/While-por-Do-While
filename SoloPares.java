import java.util.Scanner;

public class SoloPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int numero = sc.nextInt();

        System.out.printf("Los primeros %d números pares son: \n", numero);
        int count = 0;
        int par = 0;
        while(count < numero) {
            System.out.println(par);
            par += 2;
            count++;
        }

    }
}
