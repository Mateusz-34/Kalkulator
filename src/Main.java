import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Wybierz działanie (+, -, *, /, s - średnia, h - historia, x - wyjście): ");
        String op = sc.next();

        if (op.equals("+")) {
            System.out.print("Podaj pierwszą liczbę: ");
            double a = sc.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double b = sc.nextDouble();

            System.out.println("Wynik: " + a + " + " + b + " = " + (a + b));
        } else if (op.equals("-")) {
            System.out.print("Podaj pierwszą liczbę: ");
            double a = sc.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double b = sc.nextDouble();

            System.out.println("Wynik: " + a + " - " + b + " = " + (a - b));
        } else if (op.equals("*")) {
            System.out.print("Podaj pierwszą liczbę: ");
            double a = sc.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double b = sc.nextDouble();

            System.out.println("Wynik: " + a + " * " + b + " = " + (a * b));
        } else if (op.equals("/")) {
            System.out.print("Podaj pierwszą liczbę: ");
            double a = sc.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double b = sc.nextDouble();
            if (b != 0) {
                System.out.println("Wynik: " + a + " / " + b + " = " + (a / b));
            } else {
                System.out.println("Błąd: nie można dzielić przez zero!");
            }
        } else if (op.equals("s")){
            System.out.print("Podaj pierwszą liczbę: ");
            double a = sc.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double b = sc.nextDouble();

            System.out.println("Wynik: " + "Srednia " + "z " + a + " i " + b + " = " + (a + b) / 2);
        } else if (op.equals("h")){
            System.out.println("Tu miala byc historia: ");
        } else if (op.equals("x")) {
            System.out.println("Koniec programu");
        } else {
            System.out.println("Nieznane działanie: " + op);
        }

        sc.close();
    }
}