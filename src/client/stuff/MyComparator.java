package client.stuff;

import java.util.Comparator;

/**
 * Created by Alexander Babai on 08.01.2016.
 */
public class MyComparator implements Comparator<WithoutComparable> {

    @Override
    public int compare(WithoutComparable o1, WithoutComparable o2) {
        return (o1.getValue() < o2.getValue()) ? -1
                : ((o1.getValue() == o2.getValue()) ? 0 : 1);
    }

}
