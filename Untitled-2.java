import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Hello File!");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line = reader.readLine();
            System.out.println("File Content: " + line);
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
