import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        int numero;
        int fatorial;
        System.out.println("Digite o número");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        if (numero > 1){
            for(i = numero; i>0; i--) {
                System.out.println();
            }
        } else {
            System.out.println(numero);
        }

    }
}
