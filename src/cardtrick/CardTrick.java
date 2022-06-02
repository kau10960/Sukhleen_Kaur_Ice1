/*
Student number- 991645881
 */
package cardtrick;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
        
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Card[] magicHand = new Card[7];
        Random r = new Random();
        for(int i = 0; i < magicHand.length; i++){
            Card c1 = new Card();
            c1.setValue(r.nextInt(13) + 1);
            c1.setSuit(Card.SUITS[r.nextInt(3)]);
            magicHand[i] = c1;
        }
        
        Card userCard = new Card();
        int value;
        String suit;
        boolean find = false;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any value of card: ");
        value = input.nextInt();
        
        System.out.print("Enter suit of the card " + Arrays.toString(Card.SUITS) + ": ");
        suit = input.next();
        
        userCard.setValue(value);
        userCard.setSuit(suit);
        
        for(int i = 0; i < magicHand.length; i++){
            if(magicHand[i].getValue()==userCard.getValue() && 
                    magicHand[i].getSuit().equalsIgnoreCase(userCard.getSuit())){
                find = true;
                break;
            }
        }
        
        if(find)
            System.out.println("User card found in magic hand");
        else
            System.out.println("User card not found");
    }
    
}

