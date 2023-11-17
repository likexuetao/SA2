package demo01;

import test.Strategy;

import javax.swing.*;

public class Strategy1 extends Strategy {
    Demo01 demo01 = new Demo01();
    @Override
    public void fun() {
        demo01.show();
        img();
        text();
    }
    @Override
    public void img(){
        // 创建一个新的JFrame窗口
        JFrame frame = new JFrame();

        // 使用ImageIcon加载图片
        ImageIcon imageIcon = new ImageIcon("src/demo01/1.png");

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
        System.out.println("主程序-子程序软件体系结构：\n" +
                "这种体系结构是一种经典的设计方法，它采用“分而治之”的策略。" +
                "在这种体系结构中，主程序负责整体的控制流，而子程序则负责实现特定的功能。" +
                "主程序通过调用子程序来解决更复杂的问题。" +
                "这种体系结构简单易懂，但对于大型和复杂的软件项目来说，可能会显得组织和维护起来比较困难。");
    }
}
