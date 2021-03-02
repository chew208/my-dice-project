package com.randomizer;

import java.util.Random;
import java.util.Scanner;

public class RussianRoulette {

    private Scanner choice = new Scanner(System.in);
    private Scanner option = new Scanner(System.in);
    private int finalChoice;
    private Random kill  = new Random();
    private int killShot;
    private int i;
    private String goodChoice;

    public void chanceGame() {

        System.out.println("You feelin lucky, punk!\n(Choose number 1-6)\nor type end to stop");
        finalChoice = choice.nextInt();

        killShot = kill.nextInt(6) + 1;
        String end = null;
        do {
            if (killShot == finalChoice) {
                System.out.println("BANG! You are dead.");
            } else {
                System.out.println("You live to fight another day!");
            }
            System.out.println("Are you yeller! (Type end to stop!)");
            goodChoice = option.nextLine();
        } while (goodChoice != null);

    }
}

