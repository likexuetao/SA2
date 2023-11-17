package demo04;

import java.io.*;

public class Output4 extends Filter {
    private File file;
    public Output4(File file, Pipe input) {
        super(input, null);
        this.file = file;
    }
    public Output4(){
        super();

    }
    @Override
    protected void transform() throws IOException {
        BufferedWriter outputFile =null;
        String line;
        try {
            outputFile = new BufferedWriter(new FileWriter(file));
            while (input.hashNextLine()) {
                outputFile.write(input.readerLine()+"\n");
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
        input.closeReader();
    }
    public void show() throws IOException {
        System.out.println();
        System.out.println("使用管道-过滤软件体系结构的运行结果如下:");

        Main4.main(null);

        File file = new File("output.txt");
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
