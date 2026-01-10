package ru.сourses.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Module10 {

    //10.1
    public static void listPairChange(List<Integer> arrList) {
        for (int i = 0; i < arrList.size() - 1; i += 2) {
            int tmp = arrList.get(i);
            arrList.set(i, arrList.get(i + 1));
            arrList.set(i + 1, tmp);
        }

        System.out.println("10.1: " + arrList);
    }

    //10.2
    public static void bubbleSort(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }

        System.out.println("10.2: " + Arrays.toString(intArray));
    }

    //10.3
    public static void reverse(int[] intArray) {
        int n = intArray.length - 1;
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = temp;
        }

        System.out.println("10.3 arr: " + Arrays.toString(intArray));
    }

    public static void reverse(List<Integer> intList) {
        int n = intList.size() - 1;
        for (int i = 0; i < intList.size() / 2; i++) {
            int temp = intList.get(i);
            intList.set(i, intList.get(n - i));
            intList.set(n - i, temp);
        }

        System.out.println("10.3 list: " + intList);
    }


    //10.2.1
    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }

    //10.2.2
    public static void printList(ArrayList<Integer> list) {
        System.out.print("10.2.2:");
        list.forEach(item -> System.out.print(" " + item));
    }
}
