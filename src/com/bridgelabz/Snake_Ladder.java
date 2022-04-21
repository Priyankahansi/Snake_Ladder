package com.bridgelabz;

import java.util.Random;

public class Snake_Ladder {
    static void getDieRoll() {
        Random random = new Random();
        int roll = random.nextInt(6) + 1;
        System.out.println(roll);
    }

    public static void main(String[] args) {
        getDieRoll();
    }
}
