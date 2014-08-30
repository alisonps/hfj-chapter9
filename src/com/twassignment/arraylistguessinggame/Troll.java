package com.twassignment.arraylistguessinggame;

/**
 * Created by alisonps on 8/30/14.
 */
public class Troll implements Monster {
    private String name;
    private int hitpoints;

    Troll() {
        name = "Troll";
        hitpoints = 40;
    }

    public void takeDamage(int amount) {
        hitpoints -= (amount/2);
    }

    public String name() {
        return name;
    }

    public int currentHitpoints() {
        return hitpoints;
    }

}
