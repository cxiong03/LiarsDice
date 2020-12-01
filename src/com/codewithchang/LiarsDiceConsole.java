package com.codewithchang;

import java.util.List;

public class LiarsDiceConsole extends Console {
    static public void welcome() {
        welcome("Liar's Dice!");
    }

    static public void displayHand(List<Integer> dice) {
        System.out.println("--------");
        for (var die : dice) {
            System.out.print(die + " ");
        }
        System.out.print("\n--------\n");
    }

    static public String claimDice() {
        System.out.println("Claim how many dice are in the roll");
        String input = scanner.nextLine();
        return input;
    }
}
