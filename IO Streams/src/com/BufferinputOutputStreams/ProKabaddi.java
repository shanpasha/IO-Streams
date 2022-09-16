package com.BufferinputOutputStreams;

public class ProKabaddi extends Players{
	
	
	int numOfPoints;
	int numSuper10s;
	
	public ProKabaddi(String name, String gameName, String playedGames, Gender gender,int numOfPoints,int numSuper10s) {
		super(name, gameName, playedGames, gender);
		
		this.numOfPoints=numOfPoints;
		this.numSuper10s=numSuper10s;
		
		
	}

	@Override
	public String toString() {
		return "ProKabaddi [numOfPoints=" + numOfPoints + ", numSuper10s=" + numSuper10s + "]";
	}


	
	

}
