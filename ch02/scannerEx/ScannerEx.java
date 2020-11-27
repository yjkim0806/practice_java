import java.util.*;

class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a 2-digit-integer: ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("contents : " + input);
        System.out.printf("num = %d%n", num);
    }
}
