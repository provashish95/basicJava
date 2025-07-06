/*
 15. In a question paper, there are total 15 questions. Some question mark is 10 and some question mark is 5
How much question needed if I totaling 100 mark for 5 marks and 10 marks? 
Output:
5 marks question is 10
10 marks question is 5
 */
package assignment;

public class QuestionMarkCalculator {
    public static void main(String[] args) {
        int totalQuestions = 15;
        int totalMarks = 100;

        for (int fiveMarks = 0; fiveMarks <= totalQuestions; fiveMarks++) {
            int tenMarks = totalQuestions - fiveMarks;
            int marks = (fiveMarks * 5) + (tenMarks * 10);

            if (marks == totalMarks) {
                System.out.println("5 marks question is " + fiveMarks);
                System.out.println("10 marks question is " + tenMarks);
                break;
            }
        }
    }
}
