/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckOfCards;
import java.awt.Color;
/**
 *
 * @author joe
 */
public enum Suit {
    
    CLUBS("CLUBS", "\u2663", Color.BLACK),
    DIAMONDS("DIAMONDS", "\u2666", Color.RED),
    HEARTS("HEARTS", "\u2665", Color.RED),
    SPADES("SPADES", "\u2660", Color.BLACK);
    
    private final String text;
    private final String unicodeText;
    private final Color color;
    
    private Suit(String text, String unicodeText, Color color) {
        this.text = text;
        this.unicodeText = unicodeText;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.text;
    }
    
    public String toUnicode() {
        return unicodeText;
    }
    
    public String getAbbreviation() {
        switch(this) {
            case CLUBS: return "c";
            case DIAMONDS: return "d";
            case HEARTS: return "h";
            case SPADES: return "s";
        }
        return "";
    }
    
    public Color getColor() {
        return color;
    }
    
}
