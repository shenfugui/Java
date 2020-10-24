package cn.shenfugui.testcode.study;

import javax.swing.*;
import java.awt.*;

class JFrameButton extends JFrame {
    JButton button;
    JFrameButton(String s) {
        setTitle(s);
        setLayout(new FlowLayout());
        button = new JButton("这是"+s+"中的按钮");
        add(button);
        validate();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

public class test01 {
    public static void main(String[] args) {
        JFrame window_one = new JFrame();
        window_one.setTitle("第一个窗口");
        window_one.setBounds(10, 10, 300, 200);
        window_one.setLayout(new FlowLayout());
        window_one.setExtendedState(Frame.MAXIMIZED_HORIZ);
        JButton button = new JButton("这是第一个窗口中的按钮");
        window_one.add(button);
        window_one.validate();
        window_one.setVisible(true);
        window_one.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrameButton window_two = new JFrameButton("第二个窗口");
        window_one.setBounds(10, 10, 200, 180);
        window_two.setBounds(210, 10, 200, 180);
    }
}