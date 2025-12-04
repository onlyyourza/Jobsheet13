import java.util.Scanner;
public class GradesManager14 {
    static String[] students = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    static int[][] grades = {
        {20, 19, 25, 20, 10, 0, 10},
        {30, 30, 40, 10, 15, 20, 25},
        {5, 0, 20, 25, 10, 5, 45},
        {50, 0, 7, 8, 0, 30, 60},
        {15, 10, 16, 15, 10, 10, 5}
    };

    static void inputGrades() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Input grades for " + students[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                grades[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    static void displayAllGrades() {
        System.out.println("\n=== ALL STUDENT GRADES ===");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " : ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void findWeekHighestGrade() {
        int highest = grades[0][0];
        int weekIndex = 0;

        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < students.length; i++) {
                if (grades[i][j] > highest) {
                    highest = grades[i][j];
                    weekIndex = j;
                }
            }
        }

        System.out.println("\nHighest grade is " + highest + " in Week " + (weekIndex + 1));
    }

    static void findTopStudent() {
        int bestTotal = 0;
        int bestIndex = 0;

        for (int i = 0; i < students.length; i++) {
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                sum += grades[i][j];
            }

            if (sum > bestTotal) {
                bestTotal = sum;
                bestIndex = i;
            }
        }

        System.out.println("\nStudent with highest total grade: " + students[bestIndex]);
        System.out.println("Their weekly grades:");
        for (int j = 0; j < 7; j++) {
            System.out.println("Week " + (j + 1) + ": " + grades[bestIndex][j]);
        }
    }

    public static void main(String[] args) {
        displayAllGrades();
        findWeekHighestGrade();
        findTopStudent();
    }
}
