
import java.io.*;
import java.util.Scanner;

public class StudentDataManager {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n === Student Data Manager ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();               // consume newline
            
            if (choice == 1) {
                addStudent(sc);

            } else if (choice == 2) {
                viewStudents();

            } else if (choice == 3) {

            System.out.println("Exiting...");
            break;
            }
            else {
                System.out.println("Invalid Choice!");
            }

        }
        sc.close();
    }

    private static void addStudent(Scanner sc) {
        try {
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();                // consume newline
            System.out.println("Enter Grade: ");
            String grade = sc.nextLine();

            FileWriter writer = new FileWriter(FILE_NAME, true);
            writer.write(name + "," + age + "," + grade + "\n");
            writer.close();
            System.out.println("Student added successfully!");


        } catch (IOException e) {
            System.out.println("Error: Unable to write to file.");

        }
    }

    private static void viewStudents() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            System.out.println("\n--- Student List ---");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println("Name: " + parts[0] + ", Age: " + parts[1] + ", Grade: " + parts[2]);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Error: Unable to read file.");
        }
    }
}