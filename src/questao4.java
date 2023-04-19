import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Integer numero = null;
        Scanner teclado = new Scanner(System.in);
        while (numero == null ||numero >= 0) {
            System.out.print("Digite o número: ");
            numero = teclado.nextInt();
        } 
        teclado.close();
    }
}
