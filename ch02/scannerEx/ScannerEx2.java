import java.util.*;

class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // input a
        System.out.println("Enter first integer: ");
        String a = scanner.nextLine();

        // input b
        System.out.println("Enter second integer: ");
        String b = scanner.nextLine();
        
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);

        System.out.printf("a = %d, b = %d%n", n1, n2);
        System.out.printf("a + b = %d%n", n1 + n2);
    }
}
