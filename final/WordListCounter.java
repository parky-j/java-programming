import java.util.List;
import java.util.Iterator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordListCounter extends WordList{
	

	private String[] stopword;
	private Map<String, Integer> wordMap = new HashMap<>();

	public WordListCounter(String sentence, String[] stopword, Character[] seperator){
		super(sentence, seperator);
		this.stopword = stopword;
	}
		

	public Map<String, Integer> makeMap(){
		//Use the makeList method in the WordList class to separate words through the seperator first.
		for(String s : makeList()){
			boolean checkStopword = false;
			boolean checkNumber = false;
			//If stopword contains string made by makeList, do not store the string in WordMap.
			for(int i = 0; i < stopword.length ; i++){
				if(s.equals(stopword[i])){
					checkStopword = true;
					break;
				}
			}
			//If the String consists only of numbers, do not store the string in WordMap.
			for(int i = 0; i < s.length(); i++){
				char temp = s.charAt(i);
				if(Character.isDigit(temp) == false)
					checkNumber = true;
			}
			if(checkStopword == true)
				continue;
			else if(checkNumber == false)
				continue;
			//If not included, add to map.
			else{
				if(wordMap.containsKey(s))
					wordMap.put(s, wordMap.get(s)+1);
				else
					wordMap.put(s, 1);
			}
		}
		return wordMap;
	}

	public void showMapMoreThan(int lowerBound){
		//Use the keySet method defined in the Map to access keys stored in WordMap one by one. Print using this.
		for(String word : wordMap.keySet()){
			if(wordMap.get(word) >= lowerBound)
				System.out.println(word + ":" + wordMap.get(word));
		}
	}
}
					
				