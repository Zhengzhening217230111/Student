import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int numberOfStudents=scanner.nextInt();
        scanner.nextLine();

        Student[]students=new Student[numberOfStudents];
        for(int i=0;i<numberOfStudents;i++){
            System.out.print("Enter student ID:");
            String studentID=scanner.nextLine();

            System.out.println("Enter student name:");
            String studentName=scanner.nextLine();

            System.out.print("Enter number of extra activities:");
            int numberOfActivities=scanner.nextInt();
            scanner.nextLine();


            Student student=new Student(studentID,studentName,numberOfActivities);
            student.addExtraActivity(numberOfActivities);

            students[i]=student;
        }
        System.out.println("\nStudent Details:");
        for(Student student:students){
            System.out.println(student.toString());
        }

        }
}
