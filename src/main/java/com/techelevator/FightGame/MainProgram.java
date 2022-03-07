package com.techelevator.FightGame;

import com.techelevator.FightGame.Enemy.Enemy;
import com.techelevator.FightGame.Enemy.Ghoul;
import com.techelevator.FightGame.Enemy.Gremlin;

import java.util.*;

public class MainProgram {

	public static void main(String[] args) {

		//system objects
		Scanner in = new Scanner(System.in);        //creating a scanner object
		Random random = new Random();                //creating a Random object which generates a random number


		boolean running = true;

		System.out.println("Welcome to the Dungeon!");

		Gremlin test = new Gremlin();
		System.out.println(test.getEnemyHealth());
		System.out.println(test.attack());



		}
	}


