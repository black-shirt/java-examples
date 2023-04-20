package unlisted_experiments;

public class exception_handling {
    public static void main(String[] args) {
        int a = 10, b =0;
        try {
            System.out.println("Inside main try block");
            try {
                int c = a % b;
                System.out.println("c = " + c);
            }
            catch(ArithmeticException e) {
                System.out.println("Arithmetic Exception occurred in first nested try block");
            }
            try {
                int d = a / b;
                System.out.println("d = " + d);
            }
            catch(ArithmeticException e) {
                System.out.println("Arithmetic Exception occurred in second nested try block");
            }
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred in main try block");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception occurred in main try block");
        }
        finally {
            System.out.println("End of main try block");
        }
    }
}
