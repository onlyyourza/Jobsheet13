import java.util.Scanner;
public class GradesManager14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int studentCount = sc.nextInt();
        System.out.print("Enter number of weeks: ");
        int weekCount = sc.nextInt();
        sc.nextLine();

        String[] names = new String[studentCount];
        int[][] grades = new int[studentCount][weekCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter student name #" + (i + 1) + ": ");
            names[i] = sc.nextLine();

            for (int j = 0; j < weekCount; j++) {
                System.out.print("Grade for Week " + (j + 1) + ": ");
                grades[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        System.out.println("\n=== All Grades ===");
        for (int i = 0; i < studentCount; i++) {
            System.out.print(names[i] + " : ");
            for (int j = 0; j < weekCount; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
