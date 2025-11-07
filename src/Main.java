import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Wybierz działanie (+, -, *, /, s - średnia, h - historia, x - wyjście): ");
        String op = sc.next();

        switch (op) {
            case "+" -> {
                System.out.print("Podaj pierwszą liczbę: ");
                double a = sc.nextDouble();

                System.out.print("Podaj drugą liczbę: ");
                double b = sc.nextDouble();

                System.out.println("Wynik: " + a + " + " + b + " = " + (a + b));
            }
            case "-" -> {
                System.out.print("Podaj pierwszą liczbę: ");
                double a = sc.nextDouble();

                System.out.print("Podaj drugą liczbę: ");
                double b = sc.nextDouble();

                System.out.println("Wynik: " + a + " - " + b + " = " + (a - b));
            }
            case "*" -> {
                System.out.print("Podaj pierwszą liczbę: ");
                double a = sc.nextDouble();

                System.out.print("Podaj drugą liczbę: ");
                double b = sc.nextDouble();

                System.out.println("Wynik: " + a + " * " + b + " = " + (a * b));
            }
            case "/" -> {
                System.out.print("Podaj pierwszą liczbę: ");
                double a = sc.nextDouble();

                System.out.print("Podaj drugą liczbę: ");
                double b = sc.nextDouble();
                if (b != 0) {
                    System.out.println("Wynik: " + a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Błąd: nie można dzielić przez zero!");
                }
            }
            case "s" -> {
                System.out.print("Podaj pierwszą liczbę: ");
                double a = sc.nextDouble();

                System.out.print("Podaj drugą liczbę: ");
                double b = sc.nextDouble();

                System.out.println("Wynik: " + "Srednia " + "z " + a + " i " + b + " = " + (a + b) / 2);
            }
            case "h" -> System.out.println("Tu miala byc historia: ");
            case "x" -> System.out.println("Koniec programu");
            default -> System.out.println("Nieznane działanie: " + op);
        }

        sc.close();
    }
}