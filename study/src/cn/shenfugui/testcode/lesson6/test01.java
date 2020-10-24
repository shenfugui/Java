package cn.shenfugui.testcode.lesson6;

import java.util.Scanner;

abstract class Area {
    abstract void rectangle(double x, double y);

    abstract void circle(double r);
}

class getArea extends Area {
    @Override
    void rectangle(double x, double y) {
        System.out.println(x * y);
    }

    @Override
    void circle(double r) {
        System.out.println(3.14 * r * r);
    }
}

public class test01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Area area = new getArea();
        int choice = reader.nextInt();
        if (choice == 1) {
            double x = reader.nextDouble();
            double y = reader.nextDouble();
            area.rectangle(x, y);
        } else {
            double r = reader.nextDouble();
            area.circle(r);
        }
    }
}
