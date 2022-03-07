package com.techelevator.FightGame.Enemy;

import java.util.*;

//todo add weapon types, have some weapons add a buff

public abstract class Enemy {

    Random rand = new Random();

    List<String> colorsList = new ArrayList<String>(Arrays.asList("pink","purple","blue","green","red","black"));
    List<String> adjectivesList = new ArrayList<>(Arrays.asList("speckled","feathery","glittery"));


    public void addEnemyPattern(){
        adjectivesList.add("glittery");
        adjectivesList.add("feathery");
        adjectivesList.add("fish-scaled");
        adjectivesList.add("dirty");
        adjectivesList.add("fiery");
        adjectivesList.add("tiny");
        adjectivesList.add("zebra striped");
        adjectivesList.add("fluffy");
        adjectivesList.add("slimy");
        adjectivesList.add("spiked");
        adjectivesList.add("menacing");
        adjectivesList.add("pickled");
        adjectivesList.add("speckled");
        adjectivesList.add("rabid");
    }

    //instance variables
    private int maxEnemyHealth = 100;
    private boolean dead = false;
    //derived variables
    private int enemyHealth = rand.nextInt(maxEnemyHealth);


    private String color = colorsList.get(rand.nextInt(colorsList.size()));
    //private String adjective= adjectivesList.get(rand.nextInt(adjectivesList.size()));





    //getters
    public int getMaxEnemyHealth() {
        return maxEnemyHealth;
    }
    public int getEnemyHealth() {
        return enemyHealth;
    }
//    public String getColor() {
//        return color;
//    }
//    public String getAdjective() {
//       return adjective;
//    }

    public boolean isDead() {
        return dead;
    }

    //in case you wanted to change max ?
    public void setMaxEnemyHealth(int maxEnemyHealth) {
        this.maxEnemyHealth = maxEnemyHealth;
    }


    //constructors
    public Enemy(){

    }

    //methods

    //abstract attack method must be implemented by all enemy classes
    public abstract int attack();



    //print statement
    public void taunt() {
        System.out.println("You don't stand a chance!");
    }

    //method to test if enemy is alive or not
    public boolean isAlive() {
        if (enemyHealth <= 0) {
             dead = true;
        }
        return dead;
    }








}
