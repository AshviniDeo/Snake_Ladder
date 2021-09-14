package snakeLadder;

import java.util.Random;

public class SnakeLadder2 {

	public void Win(int position ) {
		if(position == 100) {
			System.out.println("Congratulations..You Won " );
		}
	}

	public int Check() {

		Random rand = new Random();
		int choice = rand.nextInt(3);
		return choice;
	}
	public int Player1(int position) {
		position += position;
		return position;
	}
	public int Player2(int position) {
		position += position;
		return position;
	}
	public static void main(String[] args) {
		System.out.println("Welcome To Snake Ladder...");
		SnakeLadder2 obj = new SnakeLadder2();
		Random rand = new Random();
		int player1 = 0;
		int player2 = 0;
		int position = 0;
		int counter = 0;
		while(position != 100) {
			int player = rand.nextInt(2);
			if( player == 0) {
				obj.Player1(position);
				System.out.println("Player1 turn");
				player1 = player1 + position; 

			}else {
				obj.Player2(position);
				System.out.println("Player2 turn");
				player1 = player2 + position; 
			}
			int rollDie =rand.nextInt(7);
			System.out.println("Player Rolled Die :"  + rollDie);
			counter ++;
			int check = obj.Check();
			if(check == 1) {
				position = position + rollDie;
				if(position > 100) {
					position = position - rollDie;	
					System.out.println("Player Position :"  + position);
				}else {
					System.out.println("Player Position :"  + position);
				}		

			}else if (check == 2)
			{
				position = position - rollDie;
				if(position < 0) {
					position = 0;

				}else {
					System.out.println("Player Position" + position);
				}

			}else {

				System.out.println("Player Position :"  + position);
			}

			obj.Win(position);
		}
		System.out.println("Total Die Roll is :" + counter);
	}



}


