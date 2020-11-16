package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		
int score = 0;
String answer;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

answer = JOptionPane.showInputDialog("Who makes it, has no need of it.Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

if (answer.equalsIgnoreCase("A coffin")){
	JOptionPane.showMessageDialog(null, "Correct!");
	score+=1;
}
		// 5. Otherwise, say "wrong" and tell them the answer

else JOptionPane.showMessageDialog(null, "Incorrect. The answer was A Coffin");

		// 6. Add some more riddles

answer = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
if (answer.equalsIgnoreCase("A stamp")){
	JOptionPane.showMessageDialog(null, "Correct!");
	score+=1;
}
else JOptionPane.showMessageDialog(null, "Incorrect. The answer was A Stamp");

answer = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
if (answer.equalsIgnoreCase("A Candle")){
	JOptionPane.showMessageDialog(null, "Correct!");
	score+=1;
}
else JOptionPane.showMessageDialog(null, "Incorrect. The answer was A Candle");


		// 2. Make a pop up to show the score.

JOptionPane.showMessageDialog(null, score);
	}
}

