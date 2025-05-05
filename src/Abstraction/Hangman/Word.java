package Abstraction.Hangman;

public class Word {
    private String word;
    private Category category;
    private boolean[] revealed;

    public Word(String word, Category category) {
        this.word = word.toUpperCase();
        this.category = category;
        this.revealed = new boolean[word.length()];
    }

    public Category getCategory() {
        return category;
    }

    public String getWord() {
        return word;
    }

    public boolean revealLetter(char letter) {
        boolean found = false;
        letter = Character.toUpperCase(letter);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                revealed[i] = true;
                found = true;
            }
        }
        return found;
    }

    public boolean isFullyRevealed() {
        for (int i = 0; i < revealed.length; i++) {
            if (!revealed[i] && word.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    public String getMaskedWord() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                sb.append("  ");
            } else if (revealed[i]) {
                sb.append(word.charAt(i)).append(' ');
            } else {
                sb.append("_ ");
            }
        }
        return sb.toString();
    }
}
