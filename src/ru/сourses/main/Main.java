package ru.сourses.main;


public class Main {
    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            if (isDigit(arg)) {
                double numDouble = Double.parseDouble(arg);
                sum += numDouble;
            }
        }

        System.out.println("Сумма: " + sum);
    }

    public static boolean isDigit(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        int dotCount = 0;
        int digitCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '.') {
                dotCount++;
                if (dotCount > 1) {
                    return false;
                }
            } else if (c == '-' || c == '+') {
                if (i != 0) {
                    return false;
                }
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else {
                return false;
            }
        }

        return digitCount > 0;
    }
}
