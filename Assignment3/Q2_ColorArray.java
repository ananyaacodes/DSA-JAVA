package Assignment3;

public class Q2_ColorArray {
    public static void main(String[] args) {

        String[] colors = {"Red", "Blue", "Green", "Black", "White"};

        try {
            System.out.println("Favourite Color: " + colors[2]);

            // ArrayIndexOutOfBoundsException
            System.out.println(colors[10]);

            // NullPointerException
            String s = null;
            System.out.println(s.length());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array Index Out Of Bounds");
            
        } catch (NullPointerException e) {
            System.out.println("Exception: Null Pointer");
        }

        System.out.println("Program Ended Successfully.");
    }
}
