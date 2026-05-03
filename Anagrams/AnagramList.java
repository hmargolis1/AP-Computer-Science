import java.util.AbstractList;
import java.util.ArrayList;

public class AnagramList extends AbstractList {

    private ArrayList<Word> wordList;

    public AnagramList() {
        this.wordList = new ArrayList<>();
    }

    public AnagramList(ArrayList<Word> wordList) {
        this.wordList = wordList;
    }

    @Override
    public Word get(int index) {
        return wordList.get(index);
    }

    @Override
    public int size() {
        return wordList.size();
    }

    public boolean add(Word word) {
        wordList.add(word);
        return true;
    }

    public boolean checkAnagram(Word word1, Word word2) {
        return (word1.getSortedWord()).equals(word2.getSortedWord());
    }

    public ArrayList<Word> searchAnagrams(String key) {
        ArrayList<Word> anagrams = new ArrayList<>();

        Word tempKey = new Word(key);
        String sortedKey = tempKey.getSortedWord();
        for (Word word : wordList) {
            if (word.sortWord().equals(sortedKey)) {
                anagrams.add(word);
            }
        }
        return anagrams;
    }

    public ArrayList<Word> getWordList() {
        return wordList;
    }

    public void setWordList(ArrayList<Word> wordList) {
        this.wordList = wordList;
    }
}
