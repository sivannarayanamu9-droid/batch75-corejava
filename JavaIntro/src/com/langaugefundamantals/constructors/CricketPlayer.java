package com.langaugefundamantals.constructors;

import java.util.Scanner;

public class CricketPlayer {
	String playerName;
	int matchesPlayed;
	double totalRuns;

	// No-arg constructor
	public CricketPlayer() {
		System.out.println("No-arg constructor called");
		playerName = "Rohit";
		matchesPlayed = 100;
		totalRuns = 6000;
	}

	public CricketPlayer(String playerName, int matchesPlayed, double totalRuns) {
		System.out.println("Parameterized constructor called");
		this.playerName = playerName;
		this.matchesPlayed = matchesPlayed;
		this.totalRuns = totalRuns;

	}

	void employeeInformation() {

		System.out.println("*****************Employee Information***************");
		double avgRuns = totalRuns / matchesPlayed;
		System.out.println("Cricket Player name :" + playerName);
		System.out.println("Matches Played :" + matchesPlayed);
		System.out.println("Total Runs scored :" + totalRuns);
		System.out.println("Average Runs :" + avgRuns);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		CricketPlayer objCricketPlayer = new CricketPlayer();// calling no arg constructor
		objCricketPlayer.employeeInformation();
		CricketPlayer objCricketPlayer2 = new CricketPlayer("kohli", 100, 10000);
		objCricketPlayer2.employeeInformation();
		System.out.println("Enter player name :");
		String playerName = sc.next();
		System.out.println("Enter matched played :");
		int matchesPlayed = sc.nextInt();
		System.out.println("Enter Total Runs :");
		double totalRuns = sc.nextDouble();
		CricketPlayer objCricketPlayer3 = new CricketPlayer(playerName, matchesPlayed, totalRuns);// calling
																									// parameterized
																									// constructor //
																									// constructor
		objCricketPlayer3.employeeInformation();
		System.out.println("main method ended");

	}

}
