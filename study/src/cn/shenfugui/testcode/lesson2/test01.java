package cn.shenfugui.testcode.lesson2;

public class test01 {
    public static void main(String[] args) {
        int a[] = new int[1000];
        int cnt = 0;
        for (int i = 2; i <= 1000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) sum += j;
            }
            if (sum == i) {
                a[cnt++] = i;
            }
        }
        for (int i = 0; i < cnt; i++) System.out.printf("%d ", a[i]);
    }
}
