package ru.courses.main;

public class Main {
    public static void main(String[] args) {

        double sum = 0;

        for (String arg : args) {
            double numDouble;
            try {
                numDouble = Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                numDouble = 0;
            }

            sum += numDouble;
        }

        System.out.println("Сумма: " + sum);
    }
}
