package snakeLadder;

import java.util.Random;

public class RollDie {

	public static void main(String[] args) {
		Random rand = new Random();
		int rollDie =rand.nextInt(7);
		 System.out.println("Player Rolled Die :"  + rollDie);

	}

}
