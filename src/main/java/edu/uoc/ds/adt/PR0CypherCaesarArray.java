package edu.uoc.ds.adt;

public class PR0CypherCaesarArray {
    private final char[] message;

    public PR0CypherCaesarArray(String message) {
        this.message = message.toCharArray();
    }

    public String cypher(final int displacement) {
        StringBuilder sb = new StringBuilder(message.length);
        for (char letter : message) {
            sb.append(getCypherChar(letter, displacement));
        }
        return sb.toString();
    }

    public char[] cypher2Array(final int displacement) {
        char[] cypherMessage = new char[message.length];
        for (int i = 0; i < message.length; i++) {
            cypherMessage[i] = getCypherChar(message[i], displacement);
        }
        return cypherMessage;
    }

    private char getCypherChar(final char letter, final int displacement) {
        // Whitespace
        if (letter == ' ') {
            return letter;
        }

        // 'A' is used when the latter is uppercase; 'a' is used when letter is lowercase
        char baseChar = letter < 'a' ? 'A' : 'a';

        int originalPosition = letter - baseChar;
        int newPosition = (originalPosition + displacement) % 26;
        return (char) (baseChar + newPosition);
    }
}
