package Abstraction.Hangman;

public class Main {
    public static void main(String[] args) {
        Word[] words = {
                new Word("CHAT", Category.ANIMAUX),
                new Word("CHIEN", Category.ANIMAUX),
                new Word("LION", Category.ANIMAUX),
                new Word("FRANCE", Category.PAYS),
                new Word("BRESIL", Category.PAYS),
                new Word("CANADA", Category.PAYS),
                new Word("INCEPTION", Category.FILMS),
                new Word("GLADIATOR", Category.FILMS),
                new Word("TITANIC", Category.FILMS),
                new Word("LAMPE", Category.OBJETS),
                new Word("ORDINATEUR", Category.OBJETS),
                new Word("BUREAU", Category.OBJETS)
        };

        Game game = new Game(words);
        game.start();
    }
}