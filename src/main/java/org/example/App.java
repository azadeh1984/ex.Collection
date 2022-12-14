package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ex2();
        ex3();

    }

    public static void ex1() {
        int[] num1 = {1, 2, 3, 4};
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }

    }

    public static void ex2() {
        int[] num2 = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        for (int i = 0; i < num2.length; i++) {
            for (int j = i + 1; j < num2.length; j++) {
                if (num2[i] == num2[j]) {
                    //num2[j] = 0;
                    System.out.println(num2[i]);
                }

            }


        }

    }

    public static void ex3() {


    }
}
