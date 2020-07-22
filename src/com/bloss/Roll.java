package com.bloss;

import java.util.Random;

public class Roll {

    int roll(int dieSize) {
        Random r = new Random();
        int result = r.nextInt(dieSize) + 1;
        return result;
    }
}
