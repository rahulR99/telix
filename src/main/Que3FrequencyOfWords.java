package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Que3FrequencyOfWords {

	static HashMap<String, Integer> getWordsFrequency(File file)
			throws IOException {
		HashMap<String, Integer> freq = new HashMap<String, Integer>();
		FileInputStream fin = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fin);
		BufferedReader br = new BufferedReader(isr);
		String line;

		while (true) {
			line = br.readLine();
			if (line == null) {
				break;
			}
			// StringTokenizer words = new StringTokenizer(line);
			String out[] = line.split("(?<=[,.])|(?=[,.])|\\s+");
			for (String word : out) {
				if (freq.containsKey(word)) {
					int key = freq.get(word);
					freq.put(word, ++key);
				} else {
					freq.put(word, 1);
				}
			}

		}
		return freq;
	}

	public static ArrayList<String> getTheFrequentWordList() {
		ArrayList<String> list = new ArrayList<String>();
		File file = new File("c:\\inp\\input.txt");
		try {
			HashMap<String, Integer> freq = getWordsFrequency(file);
			Set<String> set1 = freq.keySet();
			for (String temp1 : set1) {
			 System.out.println(temp1+":"+freq.get(temp1));	
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
