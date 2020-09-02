/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.app;

import game.api.Game;
import game.solitaire.SolitaireGameImpl;

/**
 *
 * @author joe
 */
public class GameTester {
    
    public static void main(String[] args) {
        // For testing purposes - game is designed to run as an engine via API calls - main is provided for testing.
        System.out.println("Solitaire game starts");
        
        Game solitaireGame = new SolitaireGameImpl();
        solitaireGame.buildGame();
        solitaireGame.startAGame();
        solitaireGame.playAGame();
        solitaireGame.recordResults();
    }


    
}

