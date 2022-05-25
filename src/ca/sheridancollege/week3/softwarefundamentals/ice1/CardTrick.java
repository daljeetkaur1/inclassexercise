/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * 
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author ----
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] luckyCard = new Card[7];
        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i<luckyCard.length; i++)
        {
            Random r = new Random();
            int number = r.nextInt(13) + 1;
            Card c = new Card();
            c.setValue(number);
            int newNumber = r.nextInt(4);
            c.setSuit(Card.SUITS[newNumber]);
            luckyCard[i] = c;
        }
        System.out.print("Enter the card suit: ");
        String cardSuit = sc.nextLine();
        System.out.print("Enter the card number: ");
        int cardNumber = sc.nextInt();
        boolean cardFound = false;
        for(int i = 0; i < luckyCard.length; i++) {
            if(luckyCard[i].getValue() == cardNumber && luckyCard[i].getSuit().equals(cardSuit)) {
                System.out.println("Card found!");
                System.out.println("Card Suit: "+ luckyCard[i].getSuit());
                System.out.println("Card Value: "+ luckyCard[i].getValue());
                cardFound = true;
            }
        }
        if(!cardFound) {
            System.out.println("Card not found!");
        }
        else
        {
            System.out.println("you loose");
        }
    }
}
