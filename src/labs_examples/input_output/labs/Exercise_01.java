package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 * <p>
 * Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 * Make sure you close the connections to both files.
 */

class Example {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("/Users/oblivious_peacemaker/Documents/CodingNomads/labs/" +
                    "online-java-fundamentals/src/labs_examples/input_output/files/byte_data.txt");
            bufferedInputStream = new BufferedInputStream(inputStream);
            outputStream = new FileOutputStream("/Users/oblivious_peacemaker/Documents/CodingNomads/labs/" +
                    "online-java-fundamentals/src/labs_examples/input_output/files/byte_data_copy.txt");

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1){
                // print out bytes read to console
                outputStream.write(buffer);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException exc) {
                System.out.println("IO Exception Caught.");
            }
        }

    }
}