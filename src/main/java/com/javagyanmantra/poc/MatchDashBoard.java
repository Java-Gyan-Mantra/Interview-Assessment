package com.javagyanmantra.poc;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MatchDashBoard {

	@SuppressWarnings("unchecked")
	public void findTop4FieldFirst() {
		List<Matches> matches = (List<Matches>) CsvDataMapper.extractData(Constant.MATCH_CSV);
		Map<String, Integer> tossMap = new LinkedHashMap<>();
		matches.stream().filter(match -> (match.getDate().contains("2017") || match.getDate().contains("2016"))
				&& match.getToss_decission().equalsIgnoreCase("field")).distinct().forEach(match -> {
					if (tossMap.containsKey(match.getToss_win())) {
						tossMap.put(match.getToss_win(), tossMap.get(match.getToss_win()) + 1);
					} else {
						tossMap.put(match.getToss_win(), 1);
					}
				});

		tossMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(4)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new))
				.forEach((key, value) -> {
					System.out.println("Team : " + key + " Count : " + value);
				});

	}

	@SuppressWarnings("unchecked")
	public void findTotal4And6Score() {
		List<Deliveries> scores = (List<Deliveries>) CsvDataMapper.extractData(Constant.DELIVERIES_CSV);
		Map<String, Integer> score4Map = new LinkedHashMap<>();
		Map<String, Integer> score6Map = new LinkedHashMap<>();
		Set<String> teams = new LinkedHashSet<>();

		scores.stream().forEach(score -> {
			teams.add(score.getBatting_team());
		});
		for (String team : teams) {
			for (Deliveries score : scores) {
				if (score.getBatting_team().equalsIgnoreCase(team)) {
					if (score.getBatsMan_runs() == 4) {
						if (score4Map.containsKey(Constant.FOUR)) {
							score4Map.put(Constant.FOUR, score4Map.get(Constant.FOUR) + 1);
						} else {
							score4Map.put(Constant.FOUR, 1);
						}
					}
					if (score.getBatsMan_runs() == 6) {
						if (score6Map.containsKey(Constant.SIX)) {
							score6Map.put(Constant.SIX, score6Map.get(Constant.SIX) + 1);
						} else {
							score6Map.put(Constant.SIX, 1);
						}
					}

				}

			}
			int totalScore = score4Map.get(Constant.FOUR) * 4 + score6Map.get(Constant.SIX) * 6;
			System.out.println("Team Name : " + team);
			System.out.println("four counts : " + score4Map);
			System.out.println("six counts : " + score6Map);
			System.out.println("Total Score : " + totalScore);
			System.out.println("=====================================================================================");
		}

	}

	@SuppressWarnings("unchecked")
	public void findEconomyBowler() {
		List<Deliveries> scores = (List<Deliveries>) CsvDataMapper.extractData(Constant.DELIVERIES_CSV);
		Map<String[], Integer> bowlerMap = new LinkedHashMap<>();
		Set<String> bowlers = new LinkedHashSet<>();
		Set<Integer> over = new LinkedHashSet<>();
		Set<Integer> runs = new LinkedHashSet<>();
		scores.stream().forEach(score -> {
			bowlers.add(score.getBowler());
		});
		for (String bowlerName : bowlers) {
			for (Deliveries score : scores) {
				if (score.getBowler().equalsIgnoreCase(bowlerName)) {
					over.add(score.getOver());
					runs.add(score.getTotal_runs());
				}
			}

			if (over.size() >= 10) {
				int totalRun = runs.stream().mapToInt(i -> i).sum();
				bowlerMap.put(new String[] { bowlerName, String.valueOf(totalRun) }, over.size());
				over.clear();
				runs.clear();

			}
		}
		bowlerMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(10)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new))
				.forEach((key, value) -> {
					System.out.println("palyer Name : " + key[0] + " economy : " + (Integer.valueOf(key[1]) / value));
				});
	}

	public static void main(String[] args) {
		MatchDashBoard dashBoard = new MatchDashBoard();
		dashBoard.findTop4FieldFirst();
		dashBoard.findTotal4And6Score();
		dashBoard.findEconomyBowler();
		/* Try 4th requirement it similar to 3rd one */
	}

}
