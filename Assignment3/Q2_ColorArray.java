package Assignment3;

public class Q2_ColorArray {
    public static void main(String[] args) {

        String[] colors = {"Red", "Blue", "Green", "Black", "White"};

        // ArrayIndexOutOfBoundsException
        try {
            System.out.println("Favourite Color: " + colors[2]);
            System.out.println(colors[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array Index Out Of Bounds");
        }

        // NullPointerException
        try {
            String s = null;
            System.out.println(s.length());

        } catch (NullPointerException e) {
            System.out.println("Exception: Null Pointer");
        }

        System.out.println("Program Ended Successfully.");
    
    }
}
