package test;
import demo01.Strategy1;
import demo02.Strategy2;
import demo03.Strategy3;
import demo04.Strategy4;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        while(true){
            conduct();
        }
    }
    public static void conduct() throws Exception {
        UI ui = new UI();
        Strategy strategy;
        int num = ui.title();
        if (num == 1){
            strategy = new Strategy1();
        } else if (num == 2) {
            strategy = new Strategy2();
        } else if (num == 3) {
            strategy = new Strategy3();
        }else if (num == 4){
            strategy = new Strategy4();
        }else {
            strategy = null;
            System.out.println("输入错误");
        }
        try{
            if (strategy != null) {
                strategy.fun();
                File file = new File("src/test/output.txt");
                file.delete();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
