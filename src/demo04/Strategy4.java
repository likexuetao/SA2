package demo04;

import test.Strategy;

import javax.swing.*;
import java.io.IOException;

public class Strategy4 extends Strategy {
    Output4 output = new Output4();
    @Override
    public void fun() throws IOException {
        output.show();
        img();
        text();
    }

    @Override
    public void img() {
        // 创建一个新的JFrame窗口
        JFrame frame = new JFrame();

        // 使用ImageIcon加载图片
        ImageIcon imageIcon = new ImageIcon("src/demo04/4.png");

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
        System.out.println("管道-过滤软件体系结构：\n" +
                "在管道-过滤体系结构中，数据通过一系列的过滤器进行处理，每个过滤器都负责执行一项特定的操作，然后将结果传递给下一个过滤器。这种体系结构有利于并行计算和错误隔离，因为每个过滤器都可以独立运行，并且一个过滤器的错误不会影响到其它的过滤器。然而，对于需要复杂交互的应用来说，这种体系结构可能会显得比较复杂。");
    }
}
