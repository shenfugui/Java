package cn.shenfugui.testcode.lesson6;

interface Shape2 {
    double computerArea();
}

class Rectangle implements Shape2 {
    double x;
    double y;

    @Override
    public double computerArea() {
        return x * y;
    }
}

class Square implements Shape2 {
    double x;

    @Override
    public double computerArea() {
        return x * x;
    }
}

class Circle implements Shape2 {
    double r;

    @Override
    public double computerArea() {
        return 3.14 * r * r;
    }
}

public class test02 {
    public static void main(String[] args) {
        double sumArea = 0;
        for (int i = 0; i < 100; i++) {
            int k = (int) Math.ceil(Math.random() * 3);
            switch (k) {
                case 1:
                    Circle circle = new Circle();
                    circle.r = (Double) Math.ceil(Math.random() * 3);
                    sumArea += circle.computerArea();
                    break;
                case 2:
                    Rectangle rect = new Rectangle();
                    rect.x = (Double) Math.ceil(Math.random() * 3);
                    rect.y = (Double) Math.ceil(Math.random() * 3);
                    sumArea += rect.computerArea();
                    break;
                case 3:
                    Square squ = new Square();
                    squ.x = (Double) Math.ceil(Math.random() * 3);
                    sumArea += squ.computerArea();
                    break;
            }
        }
        System.out.println(sumArea);
    }
}
