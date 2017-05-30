package c09;

import java.util.Iterator;

/**
 * Created by Zack on 2017/5/30.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
