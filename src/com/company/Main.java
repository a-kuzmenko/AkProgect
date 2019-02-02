package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String strInt = "123";
        String strDouble = "123.4";
        int x;
        double y;

        x = Integer.parseInt(strInt);
        y = Double.parseDouble(strDouble);
        System.out.println("x = " + x);
        System.out.println("y = " +  y);

        strInt = String.valueOf(x + 1);
        strDouble = String.valueOf(y + 1);
        System.out.println("strInt" + strInt);
        System.out.println("strDouble" + strDouble);

        String str;
        str = "num = " + 345;
        System.out.println(str);

        System.out.println(Integer.toString(262));
        System.out.println(Integer.toBinaryString(262));
        System.out.println(Integer.toHexString(267));
        System.out.println(Integer.toOctalString(267));

        int [] a = {1, 2, 3, 4, 5, 6, 7};
        int [] b = new int [4];

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("\n");

        for (int i : a) {
            System.out.println(i);
        }

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
        System.out.println("\n");
        Arrays.stream(a)
                .map(s->s*2)
                .forEach(s -> System.out.print(s + " ") );
        System.out.println();

        int i = 0;
        System.out.println("Вывести массив с помощью цикла while : ");
        while (i < a.length){
           System.out.print(a[i] + " ");
           i++;
        }
        System.out.println();

        System.out.println("Вывести массив с помощью Arrays: ");
        System.out.println(Arrays.toString(a));
        System.out.println();

        System.out.println("Вывести двойной массив: ");
        int [][] a1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] ints : a1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        invert(a);
        System.out.println(Arrays.toString(a));
    }

    private static void invert(int[] a) {
        for (int j = 0; j < a.length/2; j++) {
            int temp = a[j];
            a[j] = a[a.length - j - 1];
            a[a.length - j - 1] = temp;

        }
    }
}
