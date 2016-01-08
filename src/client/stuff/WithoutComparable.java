package client.stuff;

/**
 * Created by Alexander Babai on 08.01.2016.
 */
public class WithoutComparable {
    private int value;

    public WithoutComparable(int i) {
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
}
