package cn.shenfugui.testcode.lesson2;

public class test02 {
    public static void main(String[] args) {
        long a[] = new long[10];
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i != 0)
                a[i] = 8 * (long)Math.pow(10, i) + a[i - 1];
            else
                a[i] = 8 * (long)Math.pow(10, i);
            sum += a[i];
        }
        System.out.println(sum);
    }
}
