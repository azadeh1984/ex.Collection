package org.example;

import java.util.*;

public class ArrayListExcersises {

    public static void main(String[] args) {
        ex12();
    }

    public static void ex1() {
        // todo: start
        List<String> weekdays = new ArrayList<>();
        weekdays.add("monday");
        weekdays.add("tuesday");
        weekdays.add("wendsday");
        weekdays.add("friday");
        weekdays.add(3, "thursday");
        for (String day : weekdays) {
            System.out.println(day);
        }
    }


    public static void ex4() {
        // todo: start
        List<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        List<String> newWeekDays = weekDays.subList(0, 3);
        System.out.println(newWeekDays);
    }

    public static void ex5() {
        HashSet<String> weekDays = new HashSet<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        System.out.println(weekDays);
        System.out.println(weekDays.hashCode());

    }

    public static void ex6() {
        HashSet<String> weekDays = new HashSet<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        ArrayList<String> weekDays2 = new ArrayList<>(weekDays);
        System.out.println(weekDays2);
    }

    public static void ex7() {
        HashSet<String> names = new HashSet<>();
        names.add("artina");
        names.add("yalda");
        names.add("azadeh");
        ArrayList<String> names2 = new ArrayList<>(names);
        Collections.sort(names2);
        for (String name : names2) {
            System.out.println(name);


        }
    }

    public static void ex8() {
        HashSet<String> names = new HashSet<>();
        names.add("artina");
        names.add("yalda");
        names.add("azadeh");
        TreeSet<String> treeNames = new TreeSet<>(names);
        //treeNames.addAll(names);
        System.out.println(treeNames);
    }

    public static void ex9() {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(123, "benz");
        cars.put(456, "volvo");
        cars.put(789, "BMW");
        System.out.println(cars);
    }

    public static void ex10() {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(123, "benz");
        cars.put(456, "volvo");
        cars.put(789, "BMW");
        for (Map.Entry entry : cars.entrySet()) {
            System.out.println(entry.getKey());


        }

    }

    public static void ex11() {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(123, "benz");
        cars.put(456, "volvo");
        cars.put(789, "BMW");
        for (Map.Entry entry : cars.entrySet()) {
            System.out.println(entry.getValue());
        }

    }

    public static void ex12() {

        Map<Integer, Car> cars2 = new HashMap<>();
        cars2.put(1, new Car(1, "Benz", "S"));
        cars2.put(2, new Car(12, "Hundai", "accent"));
        cars2.put(3, new Car(13, "BMW", "X6"));
        for (Map.Entry<Integer, Car> elements : cars2.entrySet()) {
            System.out.println(elements.getValue().getBrand());


        }


    }


}