package edu.hw3.Task8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class BackwardIterator<T> implements Iterator<T> {
    final Stack<T> stack = new Stack<>();

    public BackwardIterator(Collection<T> collection) {
        for (T elem : collection) {
            stack.push(elem);
        }
    }

    @Override
    public boolean hasNext() {
        return stack.size() > 0;
    }

    @Override
    public T next() {
        return stack.pop();
    }
}
