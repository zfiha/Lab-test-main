import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter No. of Courses: ");
        int numCourses = scanner.nextInt();

        int totalCredits = 0;
        float totalGradePoints = 0;

        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter Credit: ");
            int credit = scanner.nextInt();

            System.out.print("Enter CT: ");
            int ct = scanner.nextInt();

            System.out.print("Enter AT: ");
            int at = scanner.nextInt();

            System.out.print("Enter FE: ");
            int fe = scanner.nextInt();

            int totalMarks = ct + at + fe;
            float gradePoint = (totalMarks >= 90) ? 4.0f :
                               (totalMarks >= 80) ? 3.7f :
                               (totalMarks >= 70) ? 3.5f :
                               (totalMarks >= 60) ? 3.0f :
                               (totalMarks >= 50) ? 2.5f :
                               (totalMarks >= 40) ? 2.0f : 0.0f;

            totalCredits += credit;
            totalGradePoints += gradePoint * credit;
        }

        float cgpa = totalGradePoints / totalCredits;
        String grade = (cgpa >= 3.7) ? "A" :
                       (cgpa >= 3.5) ? "A-" :
                       (cgpa >= 3.0) ? "B+" :
                       (cgpa >= 2.5) ? "B" :
                       (cgpa >= 2.0) ? "C" : "F";

        System.out.println("\nStudent ID: " + studentID);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.println("Credit Earned: " + totalCredits);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}