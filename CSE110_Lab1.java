/*------------------------------------------------------------
// AUTHOR: RICHARD RUIZ
// FILENAME: CSE110_Lab1
// SPECIFICATION: This program calculates the average 3 test scores...
// FOR: CSE 110- Lab #1
// TIME SPENT: ~1 HR //--------------------
---------------------------------------*/

import java.util.Scanner;
public class CSE110_Lab1 {
	public static void main(String[] args) {
	
	//Variables
	double test_score1,test_score2, test_score3,test_score_avg,num_test;
	num_test = 3;
	
	//Scanners
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the score on the first test: ");
	test_score1 = input.nextDouble();
	
	System.out.print("Enter the score on the second test: ");
	test_score2 = input.nextDouble();
	
	System.out.print("Enter the score on the third test: ");
	test_score3 = input.nextDouble();
	
	test_score_avg = (test_score1 + test_score2 + test_score3)/num_test;
	
	System.out.print("Your average score is: " + test_score_avg);
	
	}
	

}
