package templatemethod.bookreader;

import java.io.*;

import java.util.Scanner;

public class ReadFromFile extends BookReader {
    private BufferedReader reader;

    @Override
    void initialize() {
        // Modify this method to open the file prideprejudice.txt (included with project)
        System.out.println("Open an input file");
        try {
            String book = "prideprejudice.txt";
            reader = new BufferedReader(new FileReader(book));
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

    @Override
    void startReading() {
        // Modify this method to read lines from the file and print each line to standard output
        System.out.println("Loop writing out each record");
        try {
            String line;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    void stopReading() {
        // Modify this method to close the file
        System.out.println("Close input file");
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
