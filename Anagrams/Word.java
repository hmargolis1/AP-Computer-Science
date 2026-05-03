public class Word {
    private String originalWord;
    private String sortedWord;

    public Word(String originalWord) {
        if (verifyWord(originalWord) == false) {
            throw new IllegalArgumentException();
        }
        this.originalWord = originalWord;
        this.sortedWord = sortWord();
    }

    public boolean verifyWord(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public void setOriginalWord(String originalWord) {
        this.originalWord = originalWord;
    }

    public String getSortedWord() {
        return sortedWord;
    }

    public void setSortedWord(String sortedWord) {
        this.sortedWord = sortedWord;
    }

    public String sortWord() {
        char[] chars = originalWord.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }

        return new String(chars);
    }
}