package test;

import java.io.File;

public class file {
    public static void main(String[] args) {
        File file = new File("text.text");
        if (file.exists()) {
            System.out.println("File exists: ");
            System.out.println(file.getAbsolutePath());// path of the file
            System.out.println(file.isFile());// boolean for file is file or folder
            System.out.println(file.getPath());//
            // file.
        } else {
            System.out.println("File does not exist");
        }
    }
}