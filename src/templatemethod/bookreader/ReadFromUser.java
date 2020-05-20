package templatemethod.bookreader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadFromUser extends BookReader {

    private ArrayList<String> words = new ArrayList<>();

    @Override
    void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the passages, press enter if you want to go to the next line and Enter twice to end the input");
        String line;
        do {
            line = scanner.nextLine();
            words.add(line);
        } while ((!line.equals("")));
        scanner.close();
    }

    @Override
    void startReading() {
      for (int i = 0; i < words.size(); i++) {
          System.out.println(words.get(i));
      }
    }

    @Override
    void stopReading() {

    }
}
