import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        int fatorial = 0;
        int n;
        int i;

        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();
        for (i = 1; i <= n; i = i + 1) {
            fatorial = fatorial * i; // 100
        }

        System.out.println(fatorial); // 1
        }

    }

