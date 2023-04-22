package datastructures;

import java.util.ArrayList;
import java.util.EmptyStackException;


public class Stack<T> {

    private final ArrayList<T> elements;

    Stack() {
        this(10);
    }

    Stack(int capacity) {
        int initialCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<>(initialCapacity);
    }

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {

        if( elements.isEmpty() ) {
            throw new EmptyStackException();
        }

        return elements.remove(elements.size() - 1);
    }
}


//public class Stack<T> {
//
//    private final ArrayList<T> elements;
//
//
//    public Stack() {
//        this(10);
//    }
//
//
//    public Stack(int capacity) {
//
//        int initCapacity = capacity > 0 ? capacity : 10;
//        elements = new ArrayList<T>(initCapacity);
//
//    }
//
//    public void push(T pushValue) {
//        elements.add(pushValue);
//    }
//
//    public T pop() {
//
//        if(elements.isEmpty()) {
//            throw new EmptyStackException();
//        }
//
//        return elements.remove(elements.size() - 1);
//
//    }
//
//}
