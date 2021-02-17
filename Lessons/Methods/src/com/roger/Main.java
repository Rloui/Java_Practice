package com.roger;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);// calls the calculateScore method
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Roger", calculateHighScorePosition(1500));
        displayHighScorePosition("Billy", calculateHighScorePosition(900));
        displayHighScorePosition("Joe", calculateHighScorePosition(400));
        displayHighScorePosition("Mat", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) { //void ... int means dont return anything back
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            //System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int rankPosition) {
        System.out.println(playerName + " managed to get into position " + rankPosition + " on the high core table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
