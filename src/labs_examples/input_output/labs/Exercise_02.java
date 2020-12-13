package labs_examples.input_output.labs;

import java.io.*;
import java.nio.CharBuffer;

/**
 * Input/Output Exercise 2: File encryption
 * <p>
 * -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 * -For example, change every 'a' to '-' and every 'e' to '~' .
 * -Make sure you close the connections to both files.
 * <p>
 * Then, ead back the encrypted file using the BufferedReader and
 * print out the unencrypted version. Does it match the original file?
 */
class Encryption {
    public static void main(String[] args) {
        int i;

        String fileReadPath = "/Users/oblivious_peacemaker/Documents/CodingNomads/labs/" +
                "online-java-fundamentals/src/labs_examples/input_output/files/char_data.txt";

        String fileWritePath = "/Users/oblivious_peacemaker/Documents/" +
                "CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_data_encrypt";
        try (BufferedReader bin = new BufferedReader(new FileReader(fileReadPath));

             PrintWriter pout = new PrintWriter(new FileWriter(fileWritePath))) {


            do {
                i = bin.read();
                if (i != -1)
                    if ((char) i == 'a')
                        i = 'z';
                pout.write(i);

            } while (i != -1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedReader bin2 = new BufferedReader(new FileReader(fileWritePath)){
            
        }
    }
}