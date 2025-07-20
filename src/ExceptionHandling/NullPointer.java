package ExceptionHandling;
//6.	Create a null object and try to call a method on it. Handle NullPointerException.
public class NullPointer {

        public static void main(String[] args) {

            String str = null; // null object

            try {
                // Trying to call a method on a null object
                int length = str.length();
                System.out.println("Length of the string: " + length);
            } catch (NullPointerException e) {
                System.out.println("Error: Cannot call method on a null object.");
            }
        }
    }
