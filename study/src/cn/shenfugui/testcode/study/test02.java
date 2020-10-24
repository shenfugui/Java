package cn.shenfugui.testcode.study;

abstract class Shape {
    abstract double computerArea();
}

class Rectangle extends Shape {
    double width,height;
    Rectangle(){}
    Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    double computerArea(){
        return width*height;
    }
}
class Square extends Rectangle{
    Square(double r){
        width=r;
        height=r;
    }
}
class Circle extends Shape {
    double r;
    Circle(){}
    Circle(double r){
        this.r=r;
    }
    double computerArea(){
        return 3.14*r*r;
    }
}

class test02 {
    public static void main (String args[]){
        Shape[] s=new Shape[5];
        s[0]=new Rectangle(4,5);
        s[1]=new Rectangle(5,6);
        s[2]=new Square(4);
        s[3]=new Square(5);
        s[4]=new Circle(6);

        double sum=0;
        for(int i=0;i<5;i++){

            sum=sum+s[i].computerArea();
            System.out.println("s["+i+"]的面积是: ");
        }
        System.out.println(sum);
    }
}