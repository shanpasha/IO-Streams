package com.BufferinputOutputStreams;

public class Cricket extends Players{
	
	
	int runs;
	int numOf50s;
	int numOf100s;
	

	public Cricket(String name, String gameName, String playedGames, Gender gender,int runs,int numOf50s,int numOf100s) {
		super(name, gameName, playedGames, gender);
		this.runs=runs;
		this.numOf50s=numOf50s;
		this.numOf100s=numOf100s;
	}


	@Override
	public String toString() {
		return "Cricket [runs=" + runs + ", numOf50s=" + numOf50s + ", numOf100s=" + numOf100s + "]";
	}


	


}
