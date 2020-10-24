package cn.shenfugui.testcode.lesson3;

public class test01 {
    public static void main(String[] args) {
        int[][] a = new int[11][11];
        for (int i = 1; i <= 10; i++) a[i][1] = a[i][i] = 1;
        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= i; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
