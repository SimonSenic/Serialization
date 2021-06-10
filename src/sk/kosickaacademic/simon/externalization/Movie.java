package sk.kosickaacademic.simon.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Movie implements Externalizable {
    private String name;
    private int year;
    private boolean three_d;

    public Movie(){
    }

    public Movie(String name, int year, boolean three_d) {
        this.name = name;
        this.year = year;
        this.three_d = three_d;
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = in.readUTF();
        this.year = in.readInt();
        this.three_d = in.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(this.name);
        out.writeInt(this.year);
        out.writeBoolean(this.three_d);
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
