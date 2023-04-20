import java.util.Scanner;

public class TypingSpeedTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Typing Speed Test!");
        System.out.println("Type the following sentence as quickly and accurately as possible:");
        String sentence = "The quick brown fox jumps over the lazy dog.";
        System.out.println(sentence);
        long startTime = System.currentTimeMillis();
        String userSentence = input.nextLine();
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        int words = userSentence.split("\\s+").length;
        int accuracy = calculateAccuracy(sentence, userSentence);
        int speed = calculateSpeed(words, timeTaken);
        System.out.println("You typed " + words + " words in " + timeTaken + " milliseconds.");
        System.out.println("Your accuracy was " + accuracy + "%.");
        System.out.println("Your typing speed was " + speed + " words per minute.");
    }

    public static int calculateAccuracy(String correct, String user) {
        int correctCount = 0;
        String[] correctWords = correct.split("\\s+");
        String[] userWords = user.split("\\s+");
        for (int i = 0; i < correctWords.length && i < userWords.length; i++) {
            if (correctWords[i].equals(userWords[i])) {
                correctCount++;
            }
        }
        return (int) (((double) correctCount / correctWords.length) * 100);
    }

    public static int calculateSpeed(int words, long time) {
        double minutes = (double) time / 60000;
        return (int) (words / minutes);
    }
}