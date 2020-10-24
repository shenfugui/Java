package cn.shenfugui.testcode.lesson2;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        long sum = 0;
        long a[] = new long[10];
        for (int i = 0; i < 10; i++) {
            if (i != 0)
                a[i] = n * (long)Math.pow(10, i) + a[i - 1];
            else
                a[i] = n * (long)Math.pow(10, i);
            sum += a[i];
        }
        System.out.println(sum);
    }
}
