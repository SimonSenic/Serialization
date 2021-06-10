package sk.kosickaacademic.simon.externalization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("The Dark Knight", 2008, false);
        Movie m2 = new Movie("Hobbit", 2012, true);

        File file = new File("movie_ext.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(m1);
            oos.writeObject(m2);
            System.out.println(m1);
        }catch (IOException e){ e.printStackTrace(); }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            m1 = (Movie) ois.readObject();
            m2 = (Movie) ois.readObject();
            System.out.println(m1.getName() +" " +m1.getYear());
        }catch (Exception e){ e.printStackTrace(); }
    }
}
