package com.techelevator.FightGame.Enemy;

import java.util.*;

public class Gremlin extends Enemy{

  private int maxAttackDealt = 35;



    public Gremlin() {
        super();

    }

    @Override
    public int attack() {
        int attackDamage = rand.nextInt(maxAttackDealt);
        return attackDamage;
    }



}



