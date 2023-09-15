import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MultipleChoice mc = new MultipleChoice();
        mc.setText("How old is Barack Obama?");
        String input = scan.nextLine();
        mc.setChoices(new String[]{"A. 45","B. 53", "C. 62", "D. 65"});
        mc.setCorrectAnswer('C');

        System.out.println(mc.getText());
        for (String choice : mc.getChoices()) {
            System.out.println(choice);
        }

        input =



        char userAnswer = 'C';
        if (userAnswer == mc.getCorrectAnswer()) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}