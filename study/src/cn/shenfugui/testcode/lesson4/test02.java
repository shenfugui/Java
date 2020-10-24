package cn.shenfugui.testcode.lesson4;

abstract class MotorVehicles {
    abstract void brake();
}

interface MoneyFare {
    void charge();
}

class Bus extends MotorVehicles implements MoneyFare {
    void brake() {
        System.out.println("公共汽车使用毂式刹车技术");
    }
    public void charge() {
        System.out.println("公共汽车：一元/人，不计算千米数 ");
    }
}

class Cinema implements MoneyFare {
    public void charge() {
        System.out.println("电影院：十元/人");
    }
}

public class test02 {
    public static void main(String[] args) {
        Bus bus101 = new Bus();
        Cinema redStarCinema = new Cinema();
        bus101.brake();
        bus101.charge();
        redStarCinema.charge();
    }
}