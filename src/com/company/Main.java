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
        ShowArray(a);
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
        ShowArray(a);

        int [] sort = {1, 5, 8, 4, 2, 0, 9};

        sort(sort);
        ShowArray(sort);

        System.out.println(new StringBuffer("adkfgfkgk").reverse());//перевернуть строку методом reverse()

        int [] arr = {10, 20, 30, 40};
        int pos = Arrays.binarySearch(arr, 25);
        System.out.println(pos);

        int[] arr0 = {1, 3, 5, 7, 4, 9};
        int[] arr1 = new int[8];
        System.arraycopy(arr0,1,arr1,2,3);
        System.out.println("arr0: " + Arrays.toString(arr1));
    }

    private static void sort(int[] sort) {
        for (int i = sort.length -1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {

                if(sort[j] > sort[j+1]) {
                    int temp = sort[j];
                    sort[j] = sort[j+1];
                    sort[j+1] = temp;
                }

            }

        }
    }

    private static void ShowArray(int[] a) {
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
