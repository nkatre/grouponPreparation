/*
 * 
 * Question: You have a robot in a grid, it can move in forward direction and can change 
its facing towards north, south, east n west and you are given a command sequence. 
So what will be the final position of the robot
Example
Grid(100*500)
Robot Position = (5,3)
Sequence =     {N,S,M,M,E,W,E,S,M,S,M}    North, East, West, South, Move forward

Question Source:  
http://www.careercup.com/question?id=16919664
http://www.geeksforgeeks.org/skype-interview-set-1/

 * Answer Source: https://github.com/ChenJiHust/CProgram/blob/master/robotMove/robot.c
 */


package Robot;

import java.util.Scanner;

public class FinalPositionOfRobot {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try{
		System.out.println("Enter the size of the grid");
		System.out.println("Enter the row of the grid");
		int M = in.nextInt();
		System.out.println("Enter the column of the grid");
		int N = in.nextInt();
		System.out.println("Enter the column of the grid");
		System.out.println("Enter the x co ordinate of robot");
		int x = in.nextInt();
		System.out.println("Enter the y co ordianate of robot");
		int y = in.nextInt();
		System.out.println("Enter the direction sequence");
		char[] SEQ = new char[]{'N','S','M','M','E','W','E','S','M','S','M'};
		finalPosition(M, N, x, y, SEQ);
		} 
		finally{
			in.close();
		}
	}
	public static void finalPosition(int M, int N, int x, int y, char[] SEQ){
		char towards='0';
		for(int i=0;i<SEQ.length;i++)
		{
			switch(SEQ[i]){
			case 'N':
				towards = 'N';
				break;
			case 'S':
				towards = 'S';
				break;
			case 'E':
				towards = 'E';
				break;
			case 'W':
				towards = 'W';
				break;
			case 'M':
				if(towards == 'N'){
					x--;
					if(x==0)
						x=M;
				}
				else if(towards == 'S')
				{	
					x++;
					if(x>M)
						x=1;
				}
				else if(towards == 'E'){
					y++;
					if(y>N)
						y=1;
				}
				else if(towards == 'W')
				{
					y--;
					if(y==0)
						y=N;
				}
				break;
			}

		}
		System.out.println("Final position co-ordinate "+x+" and "+y);

	}
	/*
	 * Analysis:
	 * Time Complexity = O(c)
	 * where c = Number of characters in the char sequence
	 * Space Complexity = O(1)
	 */
}
