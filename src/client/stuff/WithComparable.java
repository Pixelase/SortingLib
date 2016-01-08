package client.stuff;

/**
 * Created by Alexander Babai on 08.01.2016.
 */
public class WithComparable implements Comparable<WithComparable> {
    private int value;

    public WithComparable(int i) {
        super();
        this.value = i;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public int compareTo(WithComparable o) {
        return (value < o.getValue()) ? -1 : ((value == o.getValue()) ? 0 : 1);
    }
}
