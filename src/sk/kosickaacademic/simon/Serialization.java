package sk.kosickaacademic.simon;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
         Movie m1 = new Movie("Interstellar", 2014, true);
         Movie m2 = new Movie("Tom & Jerry", 2000, false);

         File file = new File("movie.ser");
         try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
             oos.writeObject(m1);
             oos.writeObject(m2);
             System.out.println(m1);
         }catch (IOException e){ e.printStackTrace(); }
    }
}
