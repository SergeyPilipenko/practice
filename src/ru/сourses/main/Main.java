package ru.сourses.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> nums = new ArrayList<>();
        double sum = 0;

        System.out.println("Для завершения ввода чисел введите: exit");
        while (true) {

            System.out.print("Введите число: ");

            String inputStr = scanner.nextLine();
            if (inputStr.equals("exit")) break;

            double numDouble;
            try {
                numDouble = Double.parseDouble(inputStr);
            } catch (NumberFormatException e) {
                System.out.println("Это не число");
                continue;
            }

            nums.add(numDouble);
        }

        for (double num : nums) {
            sum += num;
        }

        System.out.println("Сумма: " + sum);
    }
}
