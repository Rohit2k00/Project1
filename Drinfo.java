import java.util.Scanner;

public class DoctorInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for doctor's name
        System.out.print("Enter Doctor's Name: ");
        String doctorName = scanner.nextLine();

        // Taking input for doctor's ID
        System.out.print("Enter Doctor's ID: ");
        int doctorId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left in the buffer

        // Taking input for doctor's department
        System.out.print("Enter Doctor's Department: ");
        String doctorDepartment = scanner.nextLine();

        // Displaying the entered information
        System.out.println("\nDoctor Information:");
        System.out.println("Name: " + doctorName);
        System.out.println("ID: " + doctorId);
        System.out.println("Department: " + doctorDepartment);

        // Closing the scanner
        scanner.close();
    }
}
