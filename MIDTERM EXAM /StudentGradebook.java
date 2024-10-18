import java.util.Scanner;

public class StudentGradebook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        String[] studentNames = new String[numStudents];
        int[][] grades = new int[numStudents][];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter the number of assignments for " + studentNames[i] + ": ");
            int numAssignments = scanner.nextInt();
            scanner.nextLine();

            grades[i] = new int[numAssignments];
            System.out.println("Enter the grades for " + studentNames[i] + ":");
            for (int j = 0; j < numAssignments; j++) {
                System.out.print("Assignment " + (j + 1) + ": ");
                grades[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); 
        }

        double[] averageScores = new double[numStudents];
        char[] letterGrades = new char[numStudents];
        for (int i = 0; i < numStudents; i++) {
            int totalScore = 0;
            for (int j = 0; j < grades[i].length; j++) {
                totalScore += grades[i][j];
            }
            averageScores[i] = (double) totalScore / grades[i].length;

            if (averageScores[i] >= 90) {
                letterGrades[i] = 'A';
            } else if (averageScores[i] >= 80) {
                letterGrades[i] = '
