public class QuizReaderWithBonus {
    public static void main(String[] args) {

        // Ito yung tamang sagot sa quiz
        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'}; // gumamit ng char kasi isang letter lng

        // Ito naman yung sinagot ng student
        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'};

        // Dito natin bibilangin kung ilan ang tama niya
        int correctCount = 0;

        // Iikutin natin lahat ng questions isa-isa
        for (int i = 0; i < answerKey.length; i++) {

            char student = studentAnswers[i]; // Kukunin dto ung sagot ng student
            char correct = answerKey[i]; // Also dto kukunin rin ung tamang sagot

            if (student == correct) { // Check kung pareho yung tamang sagot at sagot ng student
                correctCount++; // If tama then mag a-add siya
            } else {
                // Kapag mali naman, ichecheck or ipprint niya kung ano ung tamang sagot and if correct then correct
                System.out.println("Question " + (i + 1) + ": Incorrect. You answered '"
                        + studentAnswers[i] + "', correct answer is '" + answerKey[i] + "'");
            }
        }
        // Kunin yung percentage score
        // Nilagyan natin ng "double" para hindi mawala yung decimal
        double scorePercentage = (double) correctCount / answerKey.length * 100;

        // Ipakita kung ilan ang tamang sagot
        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length);

        // Ipakita yung percentage
        System.out.println("Final Percentage: " + scorePercentage + "%");

        // Checheck dito kung pasado o hindi
        if (scorePercentage >= 70.0) {
            System.out.println("Result: PASS"); // Kapag 70% pataas passed
        } else {
            System.out.println("Result: FAIL"); // Kapag mas mababa sa 70% then bagsak siya
        }
    }
}
