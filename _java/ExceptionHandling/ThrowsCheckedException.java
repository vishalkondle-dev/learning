package _java.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public abstract class ThrowsCheckedException {
    static void readFile(int age) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("C:\\test\\a.txt");
            System.out.println(fileReader);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Some error related to FileNotFoundException");
        }
    }

    public static void main(String[] args) {
        // readFile(15); //! Unhandled exception type FileNotFoundException
        try {
            readFile(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
