package com.twassignment.arraylistguessinggame;

/**
 * Created by alisonps on 8/30/14.
 */
public class Orc implements Monster {
    private String name;
    private int hitpoints;

    Orc() {
        name = "Orc";
        hitpoints = 20;
    }

    public void takeDamage(int amount) {
        hitpoints -= amount;
    }

    public String name() {
        return name;
    }

    public int currentHitpoints() {
        return hitpoints;
    }

}
