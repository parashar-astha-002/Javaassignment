import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String first = sc.nextLine();
        System.out.print("Enter last name: ");
        String last = sc.nextLine();

        System.out.println("Full Name = " + first + " " + last);
        System.out.println("Initials = " + first.charAt(0) + "." + last.charAt(0) + ".");
    }
}
