package Assignment3;

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class Q4_GenericBox {
     public static void main(String[] args) {

        // String Box
        Box<String> box1 = new Box<>();
        box1.set("Hello");

        Box<String> ref1 = box1;

        System.out.println("String in box1: " + box1.get());
        System.out.println("String in ref1: " + ref1.get());

        ref1.set("World");

        System.out.println("\nAfter changing ref1:");
        System.out.println("box1: " + box1.get());
        System.out.println("ref1: " + ref1.get());

        // Integer Box
        Box<Integer> box2 = new Box<>();
        box2.set(100);

        Box<Integer> ref2 = box2;

        System.out.println("\nInteger in box2: " + box2.get());
        System.out.println("Integer in ref2: " + ref2.get());

        ref2.set(200);

        System.out.println("\nAfter changing ref2:");
        System.out.println("box2: " + box2.get());
        System.out.println("ref2: " + ref2.get());

        // Object Box
        Box<Object> box3 = new Box<>();

        box3.set("Java");
        System.out.println("\nObject Box contains: " + box3.get());

        box3.set(500);
        System.out.println("Object Box now contains: " + box3.get());
    }
    
}
