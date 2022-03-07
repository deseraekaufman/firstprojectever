package com.techelevator.FightGame.Enemy;

public class Ghoul extends Enemy {

    private int maxAttackDealt = 27;



    public Ghoul() {
        super();
    }

    @Override
    public int attack() {
        int attackDamage = rand.nextInt(maxAttackDealt);
        return attackDamage;
    }

}
