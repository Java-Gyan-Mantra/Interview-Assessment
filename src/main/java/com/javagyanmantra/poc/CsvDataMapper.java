package com.javagyanmantra.poc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvDataMapper {

	public static List<?> extractData(String csvFile) {
		List<Object> dataList = new ArrayList<>();
		String line = "";
		int lineNumber = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(csvFile)));) {
			while ((line = br.readLine()) != null) {

				if (lineNumber == 0) {
					lineNumber++;
					continue;
				}

				String[] data = line.split(",");
				if (csvFile.equalsIgnoreCase(Constant.MATCH_CSV)) {
					dataList.add(new Matches(Integer.valueOf(data[0]), Integer.valueOf(data[1]), data[2], data[3],
							data[4], data[5], data[6], data[7], data[8]));
				} else {
					dataList.add(new Deliveries(Integer.valueOf(data[0]), data[1], data[2], data[3],
							Integer.valueOf(data[4]), data[5], data[6], data[7], Integer.valueOf(data[8]),
							Integer.valueOf(data[9]), Integer.valueOf(data[10]), Integer.valueOf(data[11]),
							Integer.valueOf(data[12]), Integer.valueOf(data[13]), Integer.valueOf(data[14]),
							Integer.valueOf(data[15])));
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataList;
	}

}
