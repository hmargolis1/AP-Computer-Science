import java.util.ArrayList;

public class AnagramTester {
    public static void main(String[] args) {

        try {
            Word w1 = new Word("Apple");
            Word w2 = new Word("plpea");
            Word w3 = new Word("the");
            ArrayList<Word> wordList = new ArrayList<>();
            // AnagramList anagram = new AnagramList(wordList);
            System.out.println("Original: " + w1.getOriginalWord());
            System.out.println("Sorted:   " + w1.getSortedWord());
            // System.out.println("Search Anagram: " anagram.searchAnagrams(w3, w1));
        } catch (Exception e) {
            System.out.println("Test Failed: " + e.getMessage());
        }
    }
}
