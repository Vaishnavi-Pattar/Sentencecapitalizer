import java.util.Scanner;

public class SentenceCapitalizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Capitalize each word
        String capitalizedSentence = capitalizeEachWord(input);

        // Display result
        System.out.println("\nCapitalized Sentence:");
        System.out.println(capitalizedSentence);

        scanner.close();
    }

    // Method to capitalize the first letter of each word
    public static String capitalizeEachWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        String[] words = sentence.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize first letter and add the rest in lowercase
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                result.append(capitalizedWord).append(" ");
            }
        }

        return result.toString().trim();
    }
}