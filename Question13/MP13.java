import java.util.HashMap;
import java.util.Map;

public class MP13{
	public Map<String, Integer> countDigitsAndLetters(){
		Map<String, Integer> map = new HashMap<>();
		int letterValue = 0;
		int numValue = 0;
		map.put("LETTERS", letterValue);
		map.put("DIGITS", numValue);
	
		String str = "Sangmyung University 2020";
		char[] letters = str.toCharArray();

		for(char c : letters){
			if(Character.isLetter(c) || c == ' ')
				map.put("LETTERS", ++letterValue);
			else if(Character.isDigit(c))
				map.put("DIGITS", ++numValue);
		}
		return map;
	}
	public static void main(String[] args){
		MP13 mp = new MP13();
		Map<String, Integer> map = mp.countDigitsAndLetters();
		
		System.out.println("{LETTERS=" + map.get("LETTERS") + ", DIGITS=" + map.get("DIGITS") + "}");
		String str = "Sangmyung University 2020";
		char[] letters = str.toCharArray();
		System.out.print(letters[9]);
	}
}