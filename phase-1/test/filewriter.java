package test;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("poem.txt");
        writer.write("roses are red \n voilets are blue \n you are a mother fucker\nthen fuck u");
        writer.close();
    }
}