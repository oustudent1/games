/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.solitaire;

import deckOfCards.Card;
import deckOfCards.RummyDeck;
import game.api.Game;
import java.util.Stack;

/**
 *
 * @author joe
 */
public class SolitaireGameImpl implements Game {

    Stack[] tableau = {new Stack<Card>(), new Stack<Card>(), new Stack<Card>(),
        new Stack<Card>(), new Stack<Card>(), new Stack<Card>(),
        new Stack<Card>()};

    Stack[] foundation = {new Stack<Card>(), new Stack<Card>(), new Stack<Card>(),
        new Stack<Card>()};

    RummyDeck deck = new RummyDeck();

    public SolitaireGameImpl() {

    }

    @Override
    public void buildGame() {
        System.out.println("Build a game");

    }

    @Override
    public void startAGame() {
        System.out.println("Start a game");
    }

    @Override
    public void playAGame() {
        System.out.println("Play a game");
    }

    @Override
    public void recordResults() {
System.out.println("Record results");    }

}
