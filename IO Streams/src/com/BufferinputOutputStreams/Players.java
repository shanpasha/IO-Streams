package com.BufferinputOutputStreams;

public class Players {
	
	String name;
	String gameName;
	String playedGames;
	Gender gender;
	public Players(String name, String gameName, String playedGames, Gender gender) {
		super();
		this.name = name;
		this.gameName = gameName;
		this.playedGames = playedGames;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Players [name=" + name + ", gameName=" + gameName + ", playedGames=" + playedGames + ", gender="
				+ gender + "]";
	}
	
}
