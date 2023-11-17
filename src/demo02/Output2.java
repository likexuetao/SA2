package demo02;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Output2 {
    private ArrayList<String> kwicList;
    private BufferedWriter outputFile;

    public Output2(ArrayList<String> kwicList) {
        this.kwicList = kwicList;
    }

    public Output2(){

    }
    public void output(String filename){
        Iterator<String> it = kwicList.iterator();
        try {
            outputFile = new BufferedWriter(new FileWriter(filename));
            while (it.hasNext()) {
                outputFile.write(it.next()+"\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (outputFile!=null) {
                    outputFile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void show(){
        System.out.println();
        System.out.println("使用面向对象软件体系结构的运行结果如下:");

        Main2.main(null);

        File file = new File("src/test/output.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;
            while ((text = reader.readLine()) != null) {
                System.out.println(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
    }
}

