package edu.sjsu.assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Card {
    HashMap<String, String> rank = new HashMap<String, String>(){{
        put("A", "Ace");
        put("2", "Two");
        put("3", "Three");
        put("4", "Four");
        put("5", "Five");
        put("6", "Six");
        put("7", "Seven");
        put("8", "Eight");
        put("9", "Nine");
        put("10", "Ten");
        put("J", "Jack");
        put("Q", "Queen");
        put("K", "King");
    }};
    HashMap<String, String> suit = new HashMap<String, String>(){{
        put("D", "Diamonds");
        put("H", "Hearts");
        put("S", "Spades");
        put("C", "Clubs");
    }};

        String first;
    String second;

    public Card(String input){
        second = input.substring(input.length() - 1);
        first = input.substring(0, input.length() - 1);
    }

    public String getDescription(){
        StringBuilder s = new StringBuilder();
        if(rank.containsKey(first) && suit.containsKey(second)){
            s.append(rank.get(first));
            s.append(" of ");
            s.append(suit.get(second));
        }else{
            return "Unknown";
        }
        return s.toString();
    }
    public static void main(String[] args) {
        // write your code here
        Card card = new Card("11H");
        String fullDescription = card.getDescription();
    }
}
