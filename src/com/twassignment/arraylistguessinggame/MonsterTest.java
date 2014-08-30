package com.twassignment.arraylistguessinggame;

import java.util.ArrayList;

/**
 * Created by alisonps on 8/30/14.
 */
public class MonsterTest {
    public static void main(String[] args) {
        //Constant for damage to be done
        int DAMAGE = 10;

        //Create a new ArrayList of monsters
        ArrayList<Monster> monsterList = new ArrayList<Monster>();

        //Add an orc and a troll to the list
        monsterList.add(new Orc());
        monsterList.add(new Troll());

        //Make each monster take 10 points of damage
        for(Monster monster : monsterList) {
            monster.takeDamage(DAMAGE);
        }

        //Report the name and hitpoints of each monster
        for(Monster monster : monsterList) {
            System.out.println("The monster's name is " + monster.name());
            System.out.println("The monster's current hitpoints are " + monster.currentHitpoints());
        }
    }
}
