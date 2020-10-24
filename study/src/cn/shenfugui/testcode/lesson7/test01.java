package cn.shenfugui.testcode.lesson7;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = reader.nextLine();
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z') s[i] -= 32;
            else if (s[i] >= 'A' && s[i] <= 'Z') s[i] += 32;
        }
        str = new String(s);
        System.out.println(str);
    }
}