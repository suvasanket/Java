import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class alphabet {
  public static void main(String[] args) throws IOException {
    ArrayList<String> listOfStrings = new ArrayList<String>();

    BufferedReader bf = new BufferedReader(new FileReader("txt.txt"));

    String line = bf.readLine();
    line = line.replaceAll("\\s", "");
    int totalAlpha = line.length();

    while (line != null) {
      listOfStrings.add(line);
      line = bf.readLine();
    }

    String[] array = listOfStrings.toArray(new String[0]);

    int vowels = 0;

    for (int x = 0; x < array.length; x++) {
      for (int a = 0; a < array[x].length(); a++) {
        switch (array[x].charAt(a)) {
        case 'A':
          vowels++;
          break;
        case 'a':
          vowels++;
          break;
        case 'E':
          vowels++;
          break;
        case 'e':
          vowels++;
          break;
        case 'I':
          vowels++;
          break;
        case 'i':
          vowels++;
          break;
        case 'O':
          vowels++;
          break;
        case 'o':
          vowels++;
          break;
        case 'U':
          vowels++;
          break;
        case 'u':
          vowels++;
          break;
        case 'Y':
          vowels++;
          break;
        case 'y':
          vowels++;
          break;
        }
      }
    }
    System.out.println("Total no of alphabets:" + totalAlpha);
    System.out.println("no of vowels:" + vowels);
    System.out.println("no of consonants:" + (totalAlpha - vowels));
    bf.close();
  }
}
