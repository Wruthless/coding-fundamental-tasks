package datastructures;

import java.util.EmptyStackException;


public class StackImpl {

    public static void main(String[] args) {

        Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Integer[] integers = { 1, 2, 3, 4, 5 };

        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>();

        testPush(doubleStack, doubles);
        testPop(doubleStack);

        testPush(integerStack, integers);
        testPop(integerStack);

    }

    public static <T> void testPush(Stack<T> stack, T[] elements) {

        System.out.printf("%s%s%n", "Elements: ", elements.getClass());

        for ( T element : elements ) {
            System.out.printf("%s ", element);
            stack.push(element);
        }

    }

    public static <T> void testPop(Stack<T> stack) {

        System.out.printf("%n%s%n", "Popped elements: ");

        try {
            T popValue;

            while (true) {
                popValue = stack.pop();
                System.out.printf("%s ", popValue);
            }
        } catch ( EmptyStackException e ) {
            System.out.println();
            e.printStackTrace();
        }

        System.out.println();
    }

}


//public class StackImpl {
//
//    public static void main(String[] args) {
//
//        Double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5 };
//        Integer[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//        Stack<Double> dStack = new Stack<>(5);
//        Stack<Integer> iStack = new Stack<>();
//
//        testPush(dStack, doubleElements);
//        testPop(dStack);
//
//        testPush(iStack, integerElements);
//        testPop(iStack);
//
//    }
//
//
//    public static <T> void testPush(Stack<T> stack, T[] elements) {
//
//        System.out.printf("%s%s%n", "Pushed elements: ", elements.getClass());
//
//        for ( T element : elements ) {
//            System.out.printf("%s ", element);
//            stack.push(element);
//        }
//
//    }
//
//
//    public static <T> void testPop(Stack<T> stack) {
//
//        System.out.printf("%n%s%n", "Popped elements: ");
//
//        try {
//            T popValue;
//
//            while ( true ) {
//                popValue = stack.pop();
//                System.out.printf("%s ", popValue);
//            }
//        } catch ( EmptyStackException emptyStackException ) {
//            System.out.println();
//            emptyStackException.printStackTrace();
//        }
//        System.out.println();
//
//    }
//
//
//}
