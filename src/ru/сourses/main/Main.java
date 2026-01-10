package ru.сourses.main;

import ru.сourses.collections.Cat;
import ru.сourses.collections.Dog;
import ru.сourses.collections.Module10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        //10.1
        int size = 4;
        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            listInt.add(i);
        }

        Module10.listPairChange(listInt);

        //10.2
        Module10.bubbleSort(new int[]{1, 3, 2, 5, 4, 6});

        //10.3
        Module10.reverse(new int[]{1, 3, 2, 5, 4, 6});
        Module10.reverse(new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6)));

        //10.2.1
        Stream<String> stream = Stream.of("Hello", "world", "from", "stream");
        System.out.println("10.2.1: " + Module10.getStringFromStream(stream));

        //10.2.2
        Module10.printList(new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6)));

        //10.3
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        System.out.println("10.3: " + cat);
        Module10.resetClass(cat);
        System.out.println(cat);

        Dog dog = new Dog("Moscow","Jack",3);
        System.out.println(dog);
        Module10.resetClass(dog);
        System.out.println(dog);

    }
}
