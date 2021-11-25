import java.util.List;
import java.util.Iterator;
import java.util.Arrays;
import java.util.ArrayList;

public class WordList{
	private String sentence;
	private Character[] seperator;
	protected List<String> wordList = new ArrayList<>();	

	public WordList(String sentence, Character[] seperator){
		this.sentence = sentence;
		this.seperator = seperator;
	}
	public List<String> makeList(){
		//Make sure that the String stored in the setence will be later stored in the map without case-sensitive.
		char[] letters = (sentence.toLowerCase()).toCharArray();

		int cnt = 0;
		//For all characters stored in letters, verify that if they are contained in the separator.
		for(int i = 0; i < letters.length; i++){
			for(int j = 0; j < seperator.length; j++){
				if(letters[i] == seperator[j]){
					//If there is a series of seperators, skip them.
					if(cnt == i){
						cnt++;
						break;
					}
					//If contained, store in wordList.
					else{	
						wordList.add(new String(Arrays.copyOfRange(letters, cnt, i)));
						cnt = i + 1;
						break;
					}
				}
				//If it is the last Character in the letters array, save all remaining characters in wordList.
				else if((i+1) >= letters.length){				
					wordList.add(new String(Arrays.copyOfRange(letters, cnt, i+1)));
					break;
				}
			}
		}
	return wordList;
	}
	
	public void showLetters(){
		//Use Iterator to print all strings in WordList.
		for(Iterator<String> itr = wordList.iterator(); itr.hasNext(); )
			System.out.println(itr.next());
	}
}