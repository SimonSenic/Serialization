package sk.kosickaacademic.simon;

import java.io.Serializable;

public class Movie implements Serializable {
    private String name;
    private int year;
    private boolean three_d;

    public Movie(String name, int year, boolean three_d) {
        this.name = name;
        this.year = year;
        this.three_d = three_d;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public boolean isThree_d() {
        return three_d;
    }
}
