// wrapper class example
public class wrapper {
    public static void main(String[] args) {
        int num = 10;
        Integer wrappedNum = Integer.valueOf(num); // Boxing
        int unwrappedNum = wrappedNum.intValue(); // Unboxing
        System.out.println("Original number: " + num);
        System.out.println("Wrapped number: " + wrappedNum);
        System.out.println("Unwrapped number: " + unwrappedNum);
    }
}
