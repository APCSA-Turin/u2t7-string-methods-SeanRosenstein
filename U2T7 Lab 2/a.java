import java.util.Scanner;
public class a {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int score = 0;
        int wordCount = 0;
        String lastWord = null;
        String newWord = null;

        System.out.println(
                "Hello there mate, we are playing a game.\nPoints are awarded based on how your current word compares to your previously entered word, based on a set of rules.\nThe goal of the game is to achieve a score of 50 with the fewest number of entered words as possible.\n");
        System.out.print("Enter first word: ");
        wordCount ++;
        lastWord = scan.nextLine();

        while (score < 50) {
            System.out.print("\nEnter next word: ");
            newWord = scan.nextLine();


            if (newWord.equals(lastWord)) {
                score -= 10;
                System.out.println("-10 points: current word is the exact same word as the previous word");
            }


            if (newWord.compareTo(lastWord) > 0) {
                score += 2;
                System.out.println("+2 points: current word alphabetically after ");
            }

            if ((newWord.substring(0, 2)).equals(lastWord.substring(lastWord.length() - 2))) {
                score += 5;
                System.out.println("+5 points: last 2 letters of previous match first 2 letters of current");
            }
            if (newWord.indexOf(lastWord.substring(0, 1)) != -1) {
                score += 3;
                System.out.println("+3 points: first letter of previous word found in current word");
            }

            if (newWord.compareTo(lastWord) < 0) {
                score -= 5;
                System.out.println("-5 points: current word alphabetically before");
            }

            if (newWord.length() == lastWord.length()) {
                score += 4;
                System.out.println("+4 points: current word same length as previous");
            }
            
            wordCount++;
            lastWord = newWord;
            System.out.print("SCORE: " + score);
        }

            System.out.println(" Good job! You reached a score of 50! It took you " + wordCount
                + " words to so! Try again for a lower word count!");

        scan.close();
    }
}