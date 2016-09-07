/**
 * Created by evn on 07/09/2016.
 */
public class Student {
    // instance variables
    public String name;
    public double score;
    public int noOfQuizzes;

    // constructors
    public Student(String name)
    {
        this.name = name;
    }

    // methods
    public String getName()
    {
        return this.name;
    }
    public void addQuiz(double score)
    {
        this.score = this.score + score;
        noOfQuizzes = noOfQuizzes + 1;
    }
    public double getTotalScore()
    {
        return score;
    }
    public double getAvgScore()
    {
        return score / noOfQuizzes;
    }
}
