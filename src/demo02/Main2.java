package demo02;

public class Main2 {
    public static void main(String[] args) {
        Input input = new Input();
        input.input("src/test/input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output2 output = new Output2(alphabetizer.getKwicList());
        output.output("src/test/output.txt");

    }
}
