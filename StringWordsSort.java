import java.util.*;

public class StringWordsSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            char[] letters = words[i].toCharArray();

            for (int j = 0; j < letters.length - 1; j++) {
                for (int k = j + 1; k < letters.length; k++) {
                    if (letters[j] > letters[k]) {
                        char temp = letters[j];
                        letters[j] = letters[k];
                        letters[k] = temp;
                    }
                }
            }

            words[i] = new String(letters);
        }

        String sortedSentence = String.join(" ", words);

        System.out.println("Sorted Sentence: " + sortedSentence);
    }
}

