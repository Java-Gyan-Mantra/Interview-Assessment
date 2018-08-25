package com.javagyanmantra.poc;

public class Matches {
	private int match_id;
	private int Season;
	private String city;
	private String date;
	private String team1;
	private String team2;
	private String toss_win;
	private String toss_decission;
	private String winner;

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

	public int getSeason() {
		return Season;
	}

	public void setSeason(int season) {
		Season = season;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getToss_win() {
		return toss_win;
	}

	public void setToss_win(String toss_win) {
		this.toss_win = toss_win;
	}

	public String getToss_decission() {
		return toss_decission;
	}

	public void setToss_decission(String toss_decission) {
		this.toss_decission = toss_decission;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public Matches() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Matches(int match_id, int season, String city, String date, String team1, String team2, String toss_win,
			String toss_decission, String winner) {
		super();
		this.match_id = match_id;
		Season = season;
		this.city = city;
		this.date = date;
		this.team1 = team1;
		this.team2 = team2;
		this.toss_win = toss_win;
		this.toss_decission = toss_decission;
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "Matches [match_id=" + match_id + ", Season=" + Season + ", city=" + city + ", date=" + date + ", team1="
				+ team1 + ", team2=" + team2 + ", toss_win=" + toss_win + ", toss_decission=" + toss_decission
				+ ", winner=" + winner + "]";
	}

}
