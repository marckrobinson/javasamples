import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineReader {
    public static void main(String[] args) {
        LineReader lineReader = new LineReader();
        lineReader.readFileLineByLine("LineReader.java");
    }

    public void readFileLineByLine(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

