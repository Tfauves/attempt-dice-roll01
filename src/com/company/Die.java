package com.company;
import java.util.Random;

public class Die {


    public int sides;
    public int value;

    public Die(int sides, int value) {
        this.sides = sides;
        this.value = value;
    }

    public void roll() {
        Random diceValue = new Random();
        int maxSideValue = 7;
        int minSideValue = 1;
        value = diceValue.nextInt(maxSideValue) + minSideValue;
        System.out.println(value);


    }

    public void setValue() {

    }

}
