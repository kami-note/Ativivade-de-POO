import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de x:");
        int x = scanner.nextInt();

        System.out.println("Digite o valor de y:");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println("O maior valor é x: " + x);
        } else if (y > x) {
            System.out.println("O maior valor é y: " + y);
        } else {
            System.out.println("x e y são iguais: " + x);
        }

        scanner.close();
    }
}
