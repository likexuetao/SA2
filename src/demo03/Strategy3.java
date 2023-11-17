package demo03;

import test.Strategy;

import javax.swing.*;

public class Strategy3 extends Strategy {
    Output3 output = new Output3();

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
        ImageIcon imageIcon = new ImageIcon("src/demo03/3.png");

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
        System.out.println("事件系统软件体系结构：\n" +
                "事件驱动的体系结构是一种响应外部事件的设计方法。在这种体系结构中，软件的行为是由外部事件触发的。事件处理器负责响应这些事件，并根据需要调用相应的服务。这种体系结构非常适合于构建用户界面和分布式系统。");
    }
}
