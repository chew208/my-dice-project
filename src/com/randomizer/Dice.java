package com.randomizer;

import java.util.Random;
import java.util.Scanner;

public class Dice {

    private Scanner faceNumber = new Scanner(System.in);
    private int diceType;
    private Scanner diceRoll = new Scanner(System.in);
    private int rollCount;
    private Random dice = new Random();
    private int diceNumber;
    private int i;

    public void dice(){
        System.out.println("Enter a dice (# of faces) to roll: ");
        diceType = faceNumber.nextInt();

        System.out.println("\nHow many times would you like to roll: ");
        rollCount = diceRoll.nextInt();

        for(i = 0;i < rollCount;i++) {
            diceNumber = dice.nextInt(diceType) + 1;
            System.out.println(diceNumber);
        }
    }

}
