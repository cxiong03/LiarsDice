package com.codewithchang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand {
    private List<Die> dice;

    public Hand() {
        dice = new ArrayList<>();
        for (int count = 0; count < 7; count ++) {
            dice.add(new Die());
        }
    }

    public void roll(Random rand) {
        for (var die : dice) {
            die.roll(rand);
        }
    }

    public void roll(Random rand, int dieChoice) {
        dice.get(dieChoice).roll(rand);
    }

    public void roll(Random rand, List<Integer> dieChoices) {
        for (int choice : dieChoices) {
            roll(rand, choice);
        }
    }
}
