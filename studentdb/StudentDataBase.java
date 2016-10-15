import java.util.*;
import java.io.*;
import java.lang.*;

public class StudentDataBase {
	public static void main(String[] args) {

		boolean terminate = false;
		FileWriting fw = new FileWriting("savedData.txt");
		FileReading fr = new FileReading("savedData.txt");
		List<Student> stdLst = fr.getStudents();

		while (terminate == false) {

			System.out.println("\nWELCOME TO UP CEBU STUDENT'S DATA BASE\n");
			System.out.println("What do you want to do?\n");
			System.out.println("1. Register a Student");
			System.out.println("2. Retrieve Student Information");
			System.out.println("3. Delete Student Data");
			System.out.println("4. SAVE");
			System.out.println("5. EXIT");

			Scanner k1 = new Scanner(System.in);
			int choice = k1.nextInt();

			if (choice < 1 || choice > 5) {
				System.err.println("\tError Input\n");
				terminate = false;
			}
			else if (choice == 1) {
				System.out.println("REGISTER A STUDENT\n");
				System.out.print("Student Number: ");
				Scanner sc1 = new Scanner(System.in);
				String studentNum = sc1.next();
				System.out.print("First name: ");
				Scanner sc2 = new Scanner(System.in);
				String firstName = sc2.next();
				System.out.print("Middle Initial: ");
				Scanner sc3 = new Scanner(System.in);
				char middleInitial = sc3.next().charAt(0);
				System.out.print("LastName: ");
				Scanner sc4 = new Scanner(System.in);
				String lastName = sc4.next();
				System.out.print("Program: ");
				Scanner sc5 = new Scanner(System.in);
				String course = sc5.nextLine();
				System.out.print("Year: ");
				Scanner sc6 = new Scanner(System.in);
				int yearLevel = sc6.nextInt();

				fw.register(studentNum, firstName, middleInitial, lastName, course, yearLevel);	

				System.out.print("\n\tStudent Added!\n");
				terminate = false;

			}
			else if (choice == 2) {
				System.out.println("RETRIEVE STUDENT INFORMATION\n");
				System.out.print("Enter Student Number: ");
				Scanner sc1 = new Scanner(System.in);
				String studentNum = sc1.next();

				Student retrieve = fr.getStudent(studentNum);
				System.out.println(retrieve);

				terminate = false;
			}
			else if (choice == 3) {
				System.out.println("DELETE STUDENT DATA\n");
				System.out.print("Enter Student Number: ");
				Scanner sc1 = new Scanner(System.in);
				String studentNum = sc1.next();

				fw.delete(studentNum);

				System.out.print("\n\tStudent " + studentNum + " Deleted\n");
				terminate = false;
			} 
			else if (choice == 4) {
				fw.save();
				System.out.print("\t...SAVED...\n");
				terminate = false;
			} else {
				terminate = true;
			}
		}

		System.out.print("\tGOODBYE!!!");

	}
}