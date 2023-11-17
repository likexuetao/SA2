package demo04;

import java.io.File;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) throws IOException {
        File inFile = new File("src/test/input.txt");
        File outFile = new File("src/test/output.txt");
        Pipe pipe1 = new Pipe();
        Pipe pipe2 = new Pipe();
        Pipe pipe3 = new Pipe();
        Input input = new Input(inFile, pipe1);
        Shift shift = new Shift(pipe1, pipe2);
        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);
        Output4 output = new Output4(outFile,pipe3);
        input.transform();
        shift.transform();
        alphabetizer.transform();
        output.transform();

    }
}
