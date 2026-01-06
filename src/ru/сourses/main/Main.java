package ru.сourses.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа через пробел: ");
        String inputStr = scanner.nextLine();
        String[] nums = inputStr.split(" ");

        double sum = 0;

        for (String num : nums) {
            double numDouble;
            try {
                numDouble = Double.parseDouble(num);
            } catch (NumberFormatException e) {
                numDouble = 0;
            }

            sum += numDouble;
        }

        System.out.println("Сумма: " + sum);
    }
}
