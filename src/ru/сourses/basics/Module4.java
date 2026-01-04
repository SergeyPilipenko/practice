package ru.сourses.basics;

public class Module4 {

    //4.1
    public static double fraction(double x) {
        return x - (int) x;
    }

    //4.2
    public static int sumLastNums(int x) {
        int first = x % 10;
        int second = (x / 10) % 10;
        return first + second;
    }

    //4.3
    public static int charToNum(char x) {
        return x - 48;
    }

    // 4.4
    public static boolean isPositive(int x) {
        return x > 0;
    }

    //4.5
    public static boolean is2Digits(int x) {
        return (x > 9 && x < 100);
    }

    //4.6
    public static boolean isUpperCase(char x) {
        return (x >= 'A' && x <= 'Z');
    }

    //4.7
    public static boolean isInRange(int a, int b, int num) {
        return (a <= num && num <= b) || (b <= num && num <= a);
    }

    //4.8
    public static boolean isDivisor(int a, int b) {
        return (a % b == 0 || b % a == 0);
    }

    //4.9
    public static boolean isEqual(int a, int b, int c) {
        return (a == b && b == c);
    }

    //4.10
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    //4.11
    public static int abs(int x) {
        if (x < 0) return x * -1;
        return x;
    }

    //4.12
    public static int safeDiv(int x, int y) {
        if (y == 0) return 0;
        return x / y;
    }

    //4.13
    public static int max(int x, int y) {
        if (y > x) return y;
        return x;
    }

    //4.14
    public static String makeDecision(int x, int y) {
        if (x > y) return (x + " > " + y);
        if (x < y) return (x + " < " + y);
        return (x + " == " + y);
    }

    //4.15
    public static int max3(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (max > z) return max;
        return z;
    }

    //4.16
    public static boolean sum3(int x, int y, int z) {
        if (x + y == z) return true;
        if (y + z == x) return true;
        return x + z == y;
    }

    //4.17
    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) return 20;
        return sum;
    }

    //4.18
    public static boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) return false;
        if (x % 3 == 0) return true;
        return x % 5 == 0;
    }

    //4.19
    public static boolean magic6(int x, int y) {
        if (x == 6 || y == 6 || x + y == 6 || x - y == 6 || y - x == 6) return true;
        return false;
    }

    //4.20
    public static String age(int x) {
        if (x % 100 == 11 || x % 100 == 12 || x % 100 == 13 || x % 100 == 14) return (x + " лет");
        if (x % 10 == 1) return (x + " год");
        if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4) return (x + " года");
        return (x + " лет");
    }

    //4.21
    public static String day(int x){
        switch (x){
            case 1: return "Понедельник";
            case 2: return "Вторник";
            case 3: return "Среда";
            case 4: return "Четверг";
            case 5: return "Пятница";
            case 6: return "Суббота";
            case 7: return "Воскресенье";
        }
        return "Это не день недели";
    }

    //4.22
    public static void printDays(String x){
        switch (x){
            case "Понедельник": System.out.println("Понедельник");
            case "Вторник": System.out.println("Вторник");
            case "Среда": System.out.println("Среда");
            case "Четверг": System.out.println("Четверг");
            case "Пятница": System.out.println("Пятница");
            case "Суббота": System.out.println("Суббота");
            case "Воскресенье": System.out.println("Воскресенье"); break;
            default: System.out.println("Это не день недели");
        }
    }
}
