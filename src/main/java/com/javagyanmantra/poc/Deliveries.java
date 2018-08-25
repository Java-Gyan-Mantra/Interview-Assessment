package com.javagyanmantra.poc;

public class Deliveries {
	private int match_id;
	private String inning;
	private String batting_team;
	private String bowling_team;
	private int over;
	private String ball;
	private String batsman;
	private String bowler;
	private int wide_runs;
	private int bye_runs;
	private int legBye_runs;
	private int noBall_runs;
	private int penalty_runs;
	private int batsMan_runs;
	private int extra_runs;
	private int total_runs;

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

	public String getInning() {
		return inning;
	}

	public void setInning(String inning) {
		this.inning = inning;
	}

	public String getBatting_team() {
		return batting_team;
	}

	public void setBatting_team(String batting_team) {
		this.batting_team = batting_team;
	}

	public String getBowling_team() {
		return bowling_team;
	}

	public void setBowling_team(String bowling_team) {
		this.bowling_team = bowling_team;
	}

	public int getOver() {
		return over;
	}

	public void setOver(int over) {
		this.over = over;
	}

	public String getBall() {
		return ball;
	}

	public void setBall(String ball) {
		this.ball = ball;
	}

	public String getBatsman() {
		return batsman;
	}

	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}

	public String getBowler() {
		return bowler;
	}

	public void setBowler(String bowler) {
		this.bowler = bowler;
	}

	public int getWide_runs() {
		return wide_runs;
	}

	public void setWide_runs(int wide_runs) {
		this.wide_runs = wide_runs;
	}

	public int getBye_runs() {
		return bye_runs;
	}

	public void setBye_runs(int bye_runs) {
		this.bye_runs = bye_runs;
	}

	public int getLegBye_runs() {
		return legBye_runs;
	}

	public void setLegBye_runs(int legBye_runs) {
		this.legBye_runs = legBye_runs;
	}

	public int getNoBall_runs() {
		return noBall_runs;
	}

	public void setNoBall_runs(int noBall_runs) {
		this.noBall_runs = noBall_runs;
	}

	public int getPenalty_runs() {
		return penalty_runs;
	}

	public void setPenalty_runs(int penalty_runs) {
		this.penalty_runs = penalty_runs;
	}

	public int getBatsMan_runs() {
		return batsMan_runs;
	}

	public void setBatsMan_runs(int batsMan_runs) {
		this.batsMan_runs = batsMan_runs;
	}

	public int getExtra_runs() {
		return extra_runs;
	}

	public void setExtra_runs(int extra_runs) {
		this.extra_runs = extra_runs;
	}

	public int getTotal_runs() {
		return total_runs;
	}

	public void setTotal_runs(int total_runs) {
		this.total_runs = total_runs;
	}

	public Deliveries(int match_id, String inning, String batting_team, String bowling_team, int over, String ball,
			String batsman, String bowler, int wide_runs, int bye_runs, int legBye_runs, int noBall_runs,
			int penalty_runs, int batsMan_runs, int extra_runs, int total_runs) {
		super();
		this.match_id = match_id;
		this.inning = inning;
		this.batting_team = batting_team;
		this.bowling_team = bowling_team;
		this.over = over;
		this.ball = ball;
		this.batsman = batsman;
		this.bowler = bowler;
		this.wide_runs = wide_runs;
		this.bye_runs = bye_runs;
		this.legBye_runs = legBye_runs;
		this.noBall_runs = noBall_runs;
		this.penalty_runs = penalty_runs;
		this.batsMan_runs = batsMan_runs;
		this.extra_runs = extra_runs;
		this.total_runs = total_runs;
	}

	public Deliveries() {
		super();
	}

	@Override
	public String toString() {
		return "Deliveries [match_id=" + match_id + ", inning=" + inning + ", batting_team=" + batting_team
				+ ", bowling_team=" + bowling_team + ", over=" + over + ", ball=" + ball + ", batsman=" + batsman
				+ ", bowler=" + bowler + ", wide_runs=" + wide_runs + ", bye_runs=" + bye_runs + ", legBye_runs="
				+ legBye_runs + ", noBall_runs=" + noBall_runs + ", penalty_runs=" + penalty_runs + ", batsMan_runs="
				+ batsMan_runs + ", extra_runs=" + extra_runs + ", total_runs=" + total_runs + "]";
	}

}
