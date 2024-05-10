import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número mínimo: ");
        int min = sc.nextInt();

        System.out.println("Ingresa un número máximo: ");
        int max = sc.nextInt();

        int suma = 0;
        for (int i = min; i <= max; i++){
            if (i % 2 != 0){
                suma+=i;
            }
        }
        System.out.println(suma);
    }
}
