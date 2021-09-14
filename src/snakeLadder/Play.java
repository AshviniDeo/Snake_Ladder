package snakeLadder;

import java.util.Random;

public class Play {
public int Check() {
		
		Random rand = new Random();
		int choice = rand.nextInt(3);
		return choice;
	}

	public static void main(String[] args) {
		Play obj = new Play();
		int check = obj.Check();
		if(check == 1) {
			System.out.println("Ladder");
		}else if(check == 2) {
			System.out.println("Snake");
		}else {
		 System.out.println("NoPlay");	
		}
		

	}

}
