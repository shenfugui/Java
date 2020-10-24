package cn.shenfugui.testcode.lesson4;

import java.util.Scanner;

class Area {
    double top;
    double bottom;
    double height;

    double getArea() {
        return (top + bottom) * height / 2;
    }
}

public class test03 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Area[] areas = new Area[10];
        for (int i = 0; i < 10; i++) {
            areas[i] = new Area();
            areas[i].top = reader.nextDouble();
            areas[i].bottom = reader.nextDouble();
            areas[i].height = reader.nextDouble();
            System.out.println(areas[i].getArea());
        }
    }
}
