package streams;

import java.io.*;

public class Write {
    public static void main(String[] args) {
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("src/streams/numbers.txt",true));

            writer.append("6");
            writer.append("5");
            writer.append("7");
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
