package EKPL.Chapter3_ImplementingClasses.StudentObject;

/**
 * Created by Sheldon on 10/31/2016.
 */
public class Student {
    private String name;
    private double score;
    private double averageScore;
    private int quizNumber;
    private int totalQuiz;

    /**
     * @param studentName
     */
    public Student(String studentName) {
        name = studentName;
    }

    /**
     * @param initialQuizNumber
     * @param initialScore
     */
    public void addQuiz(int initialQuizNumber, int initialScore) {
        totalQuiz = totalQuiz + 1;
        quizNumber = initialQuizNumber;
        score = score + initialScore;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @return
     */
    public double getTotalScore() {
        return score;
    }

    /**
     * @return
     */
    public double getAverageScore() {
        averageScore = score / totalQuiz;
        return averageScore;
    }
}
