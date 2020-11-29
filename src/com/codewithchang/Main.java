package com.codewithchang;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
		Random rand = new Random();
		LiarsDiceConsole.welcome();
		Hand myHand = new Hand();
		myHand.roll(rand);
		LiarsDiceConsole.displayHand(myHand.getDice());
		myHand.roll(rand);
		LiarsDiceConsole.displayHand(myHand.getDice());
    }
}
