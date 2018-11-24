package HomeWork14_5;

import java.security.SecureRandom;

public class RandomSentences {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        String[] article = {"the", "a", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        int counter = 0;
        String sentence;

        while (counter < 20) {
            sentence = article[random.nextInt(article.length)] + " " +
                    nouns[random.nextInt(nouns.length)] + " " +
                    verb[random.nextInt(verb.length)] + " " +
                    preposition[random.nextInt(preposition.length)];
            sentence = sentence.substring(0, 1).toUpperCase().concat(sentence.substring(1) + ".");
            System.out.println((counter + 1) + " " + sentence);
            counter++;
        }
    }
}
