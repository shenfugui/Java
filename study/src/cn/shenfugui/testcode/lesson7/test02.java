package cn.shenfugui.testcode.lesson7;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        char[] s = word.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == ' ') {
                int j = i;
                while (++j < s.length) {
                    if (s[j] != ' ') {
                        cnt++;
                        i = j;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt + 1);
    }
}
