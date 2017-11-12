package EKPL.Chapter3_ImplementingClasses.StudentObject;

/**
 * Created by Sheldon on 10/31/2016.
 */
public class StudentTester {
    public static void main(String[] args) {
        Student student1 = new Student("Sheldon");
        student1.addQuiz(1, 90);
        student1.addQuiz(2, 95);
        student1.addQuiz(3, 90);
        double averageScore = student1.getAverageScore();
        String studentName = student1.getName();
        double totalScore = student1.getTotalScore();
        System.out.println("Student's name: " + studentName);
        System.out.println("Total score: " + totalScore);
        System.out.println("Avarage score: " + averageScore);
    }
}
