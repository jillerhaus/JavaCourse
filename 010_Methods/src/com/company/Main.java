package com.company;

public class Main {

    public static void main(String[] args) {
    	boolean gameOver = true;
    	int score = 800;
    	int levelCompleted = 5;
    	int bonus = 100;
    	int highScore = calculateScore(gameOver, score, levelCompleted, bonus);

		System.out.println(highScore);

    	score = 10000;
    	levelCompleted = 8;
    	bonus = 200;

		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println(highScore);

		highScore = calculateScore(true, 10000, 8,200);
		System.out.println(highScore);

		// Call both methods and display the results of the following scores 1500, 900, 400 & 50
		displayHighScorePosition("Fartman69420", calculateHighScorePosition(1500));
		displayHighScorePosition("CoomLord123", calculateHighScorePosition(900));
		displayHighScorePosition("Sm00thbr4in69", calculateHighScorePosition(400));
		displayHighScorePosition("YourYoungerBrother", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    	if (gameOver) {
    		int finalScore = score + (levelCompleted * bonus);
    		finalScore += 2000;
			return finalScore;
		}
    	return -1;
	}

	// Create a method called displayHighScorePosition
	// it should take a player's name as a parameter and a 2nd parameter as a position in the high score table
	public static void displayHighScorePosition(String playerName, int positionLeaderboard) {
		// You should display the player's name along with a message like " managed to get into position"
		// and the position they got ana further message "on the high score table"
		System.out.println(playerName + " managed to get into position " + positionLeaderboard + " on the leaderboard");

	}

	// Create a 2nd method called calculateHighScorePosition
	// It should be sent one argument only, the player's score
	public static int calculateHighScorePosition(int playerScore){
    	int position = 4;

    	if (playerScore > 1000) {
    		position = 1;
		} else if (playerScore > 500) {
    		position = 2;
		} else if (playerScore > 100) {
    		position = 3;
		}

    	return position;

	}

}
