package Assignment3;

public class Q5_GenericMethod {

    // Generic Method
    public static <E> void printArray(E[] inputArray) {

        for (E element : inputArray) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] intArray = {10, 20, 30, 40, 50};

        Double[] doubleArray = {10.5, 20.5, 30.5};

        Character[] charArray = {'A', 'B', 'C', 'D'};

        String[] stringArray = {"Java", "Python", "C++"};

        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("\nDouble Array:");
        printArray(doubleArray);

        System.out.println("\nCharacter Array:");
        printArray(charArray);

        System.out.println("\nString Array:");
        printArray(stringArray);
    }
}

