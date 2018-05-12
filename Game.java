import java.io.*;
import java.util.*;


class Board
{
	int dice;
	Random r;
	BufferedReader br;
	Board(){
		r=new Random();
	}
	synchronized int throwdice(String pa)
	{
		 br=new BufferedReader(new InputStreamReader(System.in));
		 try{ Thread.sleep(2000); }
		 catch(Exception e){}
		 
		 System.out.println("Press Enter To Throw the dice for"+pa+" :");
		 try {br.read();} 
		 catch (Exception e) {}
		 
		 dice=r.nextInt(6)+1;
		 return dice;
	}
}

class Player implements Runnable
{
	Thread th;
	String pna;
	Board b;
	int score;
	Player(String s,Board b){
		th=new Thread(this);
		pna=s;
		score=0;
		this.b=b;
		th.start();
	}
	public void run(){
		System.out.println("Previous Score Of "+pna+" is->"+score);
		int dice=0;
		label2:
		    while(true)
			{	 	
				dice=b.throwdice(pna);
				
				System.out.println("Dice No Of "+pna+" is ->"+dice);
				score+=dice;
					
				if(score==50){
					System.out.println(pna+" Has Won The Game !!!!!");
					System.exit(0);
				}
				else if(score==15||score==23||score==32||score==39){
					System.out.println(pna+" Got The Ladder..");
					score+=5;
				}
				else if(score==9||score==18||score==29||score==38||score==49){
					System.out.println(pna+" Has Beaten By Snaks..");
					score-=8;
				}
				else if(score>50){
					score-=dice;
				}
				System.out.println("Current Score Of "+pna+" is->"+score);
				/*if(dice==6){
					break label2;
				}*/
		   }
    }		  	
}

public class Game 
{
	public static void main(String[] args)
	{
		Board b=new Board();
		Player p1=new Player(args[0],b);
		Player p2=new Player(args[1],b);

	}
}
