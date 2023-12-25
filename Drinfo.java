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


import java.util.Scanner;

public class PatientInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for patient's name
        System.out.print("Enter Patient's Name: ");
        String patientName = scanner.nextLine();

        // Taking input for patient's room number
        System.out.print("Enter Patient's Room Number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left in the buffer

        // Taking input for type of disease
        System.out.print("Enter Type of Disease: ");
        String typeOfDisease = scanner.nextLine();

        // Taking input for treatment period
        System.out.print("Enter Treatment Period (e.g., 7 days): ");
        String treatmentPeriod = scanner.nextLine();

        // Displaying the entered information
        System.out.println("\nPatient Information:");
        System.out.println("Name: " + patientName);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Type of Disease: " + typeOfDisease);
        System.out.println("Treatment Period: " + treatmentPeriod);

        // Closing the scanner
        scanner.close();
    }
}
