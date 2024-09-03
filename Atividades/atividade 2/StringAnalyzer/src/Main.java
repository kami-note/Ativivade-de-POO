import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String input = scanner.nextLine();

        // tamanho da string
        int length = input.length();
        System.out.println("Número de caracteres: " + length);

        // tudo em maiusculo
        String upperCase = input.toUpperCase();
        System.out.println("String em maiúsculo: " + upperCase);

        // contandor de vogal
        int vowelCount = countVowels(input);
        System.out.println("Número de vogais: " + vowelCount);

        boolean startsWithUNI = input.toUpperCase().startsWith("UNI");
        System.out.println("Começa com 'UNI': " + (startsWithUNI ? "Sim" : "Não"));

        boolean endsWithRIO = input.toUpperCase().endsWith("RIO");
        System.out.println("Termina com 'RIO': " + (endsWithRIO ? "Sim" : "Não"));

        scanner.close();
    }

    private static int countVowels(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }
}