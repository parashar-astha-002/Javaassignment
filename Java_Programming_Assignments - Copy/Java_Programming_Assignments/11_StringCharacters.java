import java.util.Scanner;

public class StringCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() >= 3) {
            System.out.println("First Character = " + str.charAt(0));
            System.out.println("Last Character = " + str.charAt(str.length() - 1));
            System.out.println("Third Character = " + str.charAt(2));
        } else {
            System.out.println("String must contain at least 3 characters.");
        }
    }
}
