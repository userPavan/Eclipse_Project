package ira_pra;

public class Player {
	 
	 private int id;
	 private String name;
	 private int iccRank;
	 private int matchsPlayed;
	 private int runsScored;
	 
	 
	public Player(int id, String name, int iccRank, int matchsPlayed, int runsScored) {
		super();
		this.id = id;
		this.name = name;
		this.iccRank = iccRank;
		this.matchsPlayed = matchsPlayed;
		this.runsScored = runsScored;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIccRank() {
		return iccRank;
	}


	public void setIccRank(int iccRank) {
		this.iccRank = iccRank;
	}


	public int getMatchsPlayed() {
		return matchsPlayed;
	}


	public void setMatchsPlayed(int matchsPlayed) {
		this.matchsPlayed = matchsPlayed;
	}


	public int getRunsScored() {
		return runsScored;
	}


	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
	 
}
