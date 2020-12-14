package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

class ByteStreams {
    public static void main(String[] args) {


        String fileReadPath = "/Users/oblivious_peacemaker/Documents/CodingNomads/labs/" +
                "online-java-fundamentals/src/labs_examples/input_output/files/byte_data.txt";

        String fileWritePath = "/Users/oblivious_peacemaker/Documents/CodingNomads/labs/" +
                "online-java-fundamentals/src/labs_examples/input_output/files/byte_data_copy.txt";

        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(fileReadPath));

             BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(fileWritePath))) {



            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bin.read(buffer)) != -1){
                // print out bytes read to console
                bout.write(bytesRead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}






