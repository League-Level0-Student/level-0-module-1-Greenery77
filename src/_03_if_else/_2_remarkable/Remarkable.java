package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	
String Bob = "You make great jokes!";
String Amie = "Your art is beautiful!";
String Grace = "You're clever!";

		// 2. Ask the user to enter a name. Store their answer in a variable.

String name = JOptionPane.showInputDialog("Enter a name.");

		// 3. In a pop-up, tell the user what is remarkable about that person. 

if (name.equalsIgnoreCase("Bob")) {
	
JOptionPane.showMessageDialog(null, Bob); }


else if (name.equalsIgnoreCase("Amie")) {

JOptionPane.showMessageDialog(null, Amie);
}

else if (name.equalsIgnoreCase("Grace")) {

JOptionPane.showMessageDialog(null, Grace); 
}
}
}
	


