import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int n = sc.nextInt();

        int suma = 0;
        for (int i = 0; i < n; i++){
            if (i % 2 != 0){
                suma+=i;
            }
        }
        System.out.println(suma);
    }
}
