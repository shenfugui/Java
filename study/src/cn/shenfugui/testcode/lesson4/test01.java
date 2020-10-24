package cn.shenfugui.testcode.lesson4;

import java.util.Scanner;

class Calc {
    int a;
    int b;
    int c;
    double getX() {
        return (c - b) / 1.0 / a;
    }
}

public class test01 {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner reader = new Scanner(System.in);
        calc.a = reader.nextInt();
        calc.b = reader.nextInt();
        calc.c = reader.nextInt();
        System.out.println(calc.getX());
    }
}