package sk.kosickaacademic.simon;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        File file = new File("movie.ser");
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            Movie m1 = (Movie) ois.readObject();
            Movie m2 = (Movie) ois.readObject();
            System.out.println(m1.getName());
        }catch (Exception e){ e.printStackTrace(); }
    }
}
