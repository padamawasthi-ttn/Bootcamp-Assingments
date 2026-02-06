/*
Write a program to count number of occurrences of a word in a file. The file name and word should be supplied through commandline.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Third_Question {
    public static void main(String[] arg) {

        // Checking if required arguments are provided
        if (arg.length < 2) {
            System.out.println("Write In Correct Format - java Third_Question <filename> <word>");
            return;
        }

        String fileName = arg[0];
        String wordToFind = arg[1];
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {
                // Split line into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equals(wordToFind)) {
                        count++;
                    }
                }
            }

            System.out.println("Occurrences of word \"" + wordToFind + "\" = " + count);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
