package test;

import java.util.Scanner;

public class UI {
    public int title() throws Exception{
        System.out.println("-----------------------------欢迎使用经典软件体系结构教学软件-----------------------------");
        System.out.println("请选择你想学习的软件体系结构:");
        System.out.println("\t1.主程序-子程序软件体系结构");
        System.out.println("\t2.面向对象软件体系结构");
        System.out.println("\t3.事件系统软件体系结构");
        System.out.println("\t4.管道-过滤软件体系结构");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }
}
