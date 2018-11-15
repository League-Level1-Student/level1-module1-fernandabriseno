package extra;

public class ScoreKeeper {
 private int playerScore = 0; 
 private int opponentScore = 0; 
 private int gamesPlayed = 0; 
 
 public int getPlayerScore() {  
	return playerScore; 	 
 }

public int getGamesPlayed() {
	return gamesPlayed;
}

public void setGamesPlayed(int gamesPlayed) {
	this.gamesPlayed = gamesPlayed;
}

public void setPlayerScore(int playerScore) {
	this.playerScore = playerScore;
}

public int getOpponentScore() {
	return opponentScore;
}

public void setOpponentScore(int opponentScore) {
	this.opponentScore = opponentScore;
}




		
}
