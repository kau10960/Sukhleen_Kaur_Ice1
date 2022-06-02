/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrick;

/**
 *
 * @author HP
 */
public class Card {
     
    private String suit;
    private int value;
    
    public static final String[] SUITS = {"Clubs", "Hearts", "Diamonds", "Spades"};
    
    public String getSuit(){
        return suit;
    }
    
    public void setSuit(String suit){
        this.suit = suit;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(){
        this.value = value;
    }

    void setValue(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}


