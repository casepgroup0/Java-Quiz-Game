import java.util.Scanner;

/**
 * QuizGame.java
 * A simple multiple-choice quiz game that presents five questions,
 * validates user input, tracks correct answers, and displays a final score.
 */
public class QuizGame {

    private static String readValidAnswer(Scanner scanner) {
        String answer = scanner.nextLine();

        if (answer != null) {
            answer = answer.trim().toUpperCase();
        }

        while (answer == null || answer.isEmpty() || (!answer.equals("A") && !answer.equals("B")
                && !answer.equals("C") && !answer.equals("D"))) {
            System.out.print("Invalid input. Please enter A, B, C, or D: ");
            answer = scanner.nextLine();
            if (answer != null) {
                answer = answer.trim().toUpperCase();
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // ----------------------------------------------------------------
        // SETUP: Scanner for reading user input and score counter
        // ----------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        int score = 0;          // Tracks the number of correct answers
        String userAnswer;      // Stores the user's input for each question

        System.out.println("=========================================");
        System.out.println("       Welcome to the Java Quiz Game!    ");
        System.out.println("=========================================");
        System.out.println("Answer each question by typing A, B, C, or D.\n");

        // ================================================================
        // QUESTION 1
        // ================================================================
        System.out.println("Question 1: What does JVM stand for?");
        System.out.println("  A. Java Virtual Machine");
        System.out.println("  B. Java Verified Method");
        System.out.println("  C. Joint Variable Module");
        System.out.println("  D. Java Variable Manager");
        System.out.print("Your answer: ");
        userAnswer = readValidAnswer(scanner);

        // Evaluate answer using a switch-case statement
        switch (userAnswer) {
            case "A":
                System.out.println("Correct!\n");
                score++;
                break;
            case "B":
            case "C":
            case "D":
                System.out.println("Wrong! The correct answer is A – Java Virtual Machine.\n");
                break;
        }

        // ================================================================
        // QUESTION 2
        // ================================================================
        System.out.println("Question 2: Which keyword is used to create an object in Java?");
        System.out.println("  A. create");
        System.out.println("  B. build");
        System.out.println("  C. new");
        System.out.println("  D. object");
        System.out.print("Your answer: ");
        userAnswer = readValidAnswer(scanner);

        // Evaluate answer using an if statement
        if (userAnswer.equals("C")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is C – new.\n");
        }

        // ================================================================
        // QUESTION 3
        // ================================================================
        System.out.println("Question 3: Which of the following is NOT a primitive data type in Java?");
        System.out.println("  A. int");
        System.out.println("  B. boolean");
        System.out.println("  C. String");
        System.out.println("  D. double");
        System.out.print("Your answer: ");
        userAnswer = readValidAnswer(scanner);

        // Evaluate answer using a switch-case statement
        switch (userAnswer) {
            case "C":
                System.out.println("Correct!\n");
                score++;
                break;
            case "A":
            case "B":
            case "D":
                System.out.println("Wrong! The correct answer is C – String is a class, not a primitive.\n");
                break;
        }

        // ================================================================
        // QUESTION 4
        // ================================================================
        System.out.println("Question 4: Which operator is used to compare two values for equality in Java?");
        System.out.println("  A. =");
        System.out.println("  B. !=");
        System.out.println("  C. =>");
        System.out.println("  D. ==");
        System.out.print("Your answer: ");
        userAnswer = readValidAnswer(scanner);

        // Evaluate answer using an if statement
        if (userAnswer.equals("D")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is D – ==.\n");
        }

        // ================================================================
        // QUESTION 5
        // ================================================================
        System.out.println("Question 5: Which Java keyword is used to prevent a class from being subclassed?");
        System.out.println("  A. static");
        System.out.println("  B. abstract");
        System.out.println("  C. final");
        System.out.println("  D. private");
        System.out.print("Your answer: ");
        userAnswer = readValidAnswer(scanner);

        // Evaluate answer using a switch-case statement
        switch (userAnswer) {
            case "C":
                System.out.println("Correct!\n");
                score++;
                break;
            case "A":
            case "B":
            case "D":
                System.out.println("Wrong! The correct answer is C – final.\n");
                break;
        }

        // ----------------------------------------------------------------
        // RESULTS: Compute and display the final score as a percentage
        // ----------------------------------------------------------------
        int totalQuestions = 5;
        double percentage = ((double) score / totalQuestions) * 100;

        System.out.println("=========================================");
        System.out.println("               QUIZ COMPLETE!            ");
        System.out.println("=========================================");
        System.out.printf("You answered %d out of %d questions correctly.%n",
                score, totalQuestions);
        System.out.printf("Your final score: %.1f%%%n", percentage);

        // Provide a performance message based on score using if-else
        if (percentage == 100) {
            System.out.println("Outstanding! Perfect score!");
        } else if (percentage >= 80) {
            System.out.println("Great job! Well done!");
        } else if (percentage >= 60) {
            System.out.println("Good effort! Keep practising.");
        } else if (percentage >= 40) {
            System.out.println("Not bad, but there is room for improvement.");
        } else {
            System.out.println("Keep studying – you can do better next time!");
        }

        System.out.println("=========================================");

        // Close the scanner to release system resources
        scanner.close();
    }
}
