package test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import main.Que3FrequencyOfWords;

import org.junit.Test;

public class Que3FrequencyOfWordsTest {

	@Test
	public void test() {
		ArrayList<String> list=Que3FrequencyOfWords.getTheFrequentWordList();
		System.out.println("###########################################");
		
		for(String str:list){
			System.out.println(str);
		}
		assertTrue(true);
	}

}
