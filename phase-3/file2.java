import java.io.File;

public class file2 {
    public static void main(String[] args) {
        File file = new File("hashmap.java");
        System.out.println(file.exists());
        System.out.println(file.length());
    }
}
