package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramWriter {
    public static void main(String[] args) {
        String[] lines = new String[] { "Ane", "Caroline", "Weber"};

        String path = "C:\\Users\\lucia\\Documents\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
            
            System.out.println("File Created!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
