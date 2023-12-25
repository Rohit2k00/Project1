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


import java.util.Scanner;

public class DoctorInformation {
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

        // Taking input for date of joining
        System.out.print("Enter Date of Joining (YYYY-MM-DD): ");
        String dateOfJoining = scanner.nextLine();

        // Taking input for doctor's specialty
        System.out.print("Enter Doctor's Specialty: ");
        String doctorSpecialty = scanner.nextLine();

        // Taking input for room number
        System.out.print("Enter Doctor's Room Number: ");
        int roomNumber = scanner.nextInt();

        // Displaying the entered information
        System.out.println("\nDoctor Information:");
        System.out.println("Name: " + doctorName);
        System.out.println("ID: " + doctorId);
        System.out.println("Department: " + doctorDepartment);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println("Specialty: " + doctorSpecialty);
        System.out.println("Room Number: " + roomNumber);

        // Closing the scanner
        scanner.close();
    }
}
