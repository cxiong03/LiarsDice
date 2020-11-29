package com.codewithchang;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
		Random rand = new Random();
		Hand myHand = new Hand();
		myHand.roll(rand);
    }
}
