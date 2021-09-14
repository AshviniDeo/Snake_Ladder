package snakeLadder;

import java.util.Random;

public class Win_Part {
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

	public static void main(String[] args) {
		int position = 0;
		Random rand = new Random();
		int rollDie = rand.nextInt(7);
		 System.out.println("Player Rolled Die :"  + rollDie);
		Win_Part obj = new Win_Part();
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

}
