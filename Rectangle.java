import java.util.*;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int rows = sc.nextInt();
        System.out.println("Enter the width of rectangle : ");
        int columns = sc.nextInt();

        // Loop through each row
        for (int i = 0; i < rows; i++) {
            // Loop through each column
            for (int j = 0; j < columns; j++) {
                System.out.print("* "); // Print a star and a space
            }
            System.out.println(); // Move to the next row
       }
    }
}
