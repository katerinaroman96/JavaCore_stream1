package com.stream.numbers;

import java.util.*;

public class Main {

    private static List<Integer> filteredNumbers(List<Integer> arrayList) {
        List<Integer> arrayOfPositive = new ArrayList<>();
        for (int i = 0; i < arrayList.toArray().length; i++) {
            if (arrayList.get(i) > 0) {
                arrayOfPositive.add(arrayList.get(i));
            }
        }
        //System.out.println(arrayOfPositive + " - положительные.");
        return arrayOfPositive;
    }

    private static List<Integer> evenNumbers(List<Integer> arrayList) {
        List<Integer> arrayOfEven = new ArrayList<>();
        for (int i = 0; i < arrayList.toArray().length; i++) {
            if (arrayList.get(i) % 2 == 0) {
                arrayOfEven.add(arrayList.get(i));
            }
        }
        //System.out.println(arrayOfEven + " - четные положительные.");
        return arrayOfEven;
    }

    private static void sortedList(List<Integer> arrayList) {
        Collections.sort(arrayList);
        System.out.println("Реализовано через коллекцию: ");
        for (int counter : arrayList) {
            System.out.print(counter + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newArrayList;
        newArrayList = filteredNumbers(arrayList);
        newArrayList = evenNumbers(newArrayList);
        sortedList(newArrayList);

        StreamMain streamMain = new StreamMain();
        streamMain.main();

    }
}
