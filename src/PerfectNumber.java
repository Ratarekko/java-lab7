import java.util.Scanner;
import java.util.stream.IntStream;

public class PerfectNumber {
    public static boolean isPerfect(int number) {
        if (number <= 1) {
            return false;
        }

        int sumOfDivisors = IntStream.rangeClosed(1, number / 2)
                .filter(i -> number % i == 0)
                .sum();

        return sumOfDivisors == number;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введіть верхню межу діапазону для пошуку досконалих чисел: ");
            int limit = scanner.nextInt();

            if (limit <= 0) {
                System.out.println("Будь ласка, введіть додатне число.");
                return;
            }

            System.out.println("Досконалі числа в діапазоні від 1 до " + limit + ":");

            IntStream.rangeClosed(1, limit)
                    .filter(PerfectNumber::isPerfect)
                    .forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Некоректне введення. Будь ласка, введіть ціле число.");
        }
    }
}