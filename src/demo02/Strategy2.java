package demo02;

import test.Strategy;

import javax.swing.*;

public class Strategy2 extends Strategy {
    Output2 output = new Output2();

    @Override
    public void fun() {
        output.show();
        img();
        text();
    }

    @Override
    public void img() {
        // 创建一个新的JFrame窗口
        JFrame frame = new JFrame();

        // 使用ImageIcon加载图片
        ImageIcon imageIcon = new ImageIcon("src/demo02/2.png");

        // 创建一个标签，并设置其图标为我们的ImageIcon
        JLabel label = new JLabel();
        label.setIcon(imageIcon);

        // 将标签添加到JFrame中
        frame.add(label);

        // 设置JFrame的关闭操作、大小和可见性
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void text(){
        System.out.println();
        System.out.println("面向对象软件体系结构：\n" +
                "面向对象（OO）的软件体系结构是基于对象的概念，" +
                "对象包含数据和操作数据的方法。" +
                "这种体系结构通过封装、继承和多态等核心概念来提供代码的模块化和复用。" +
                "面向对象的软件设计使得软件更易于理解和修改，特别是在大型项目中，这种体系结构的优势更加明显");
    }
}
