import java.util.*;
public class Person {

	public static String myN;
	public static String name;
	public static void main(String[] args) {
		
		myN = greet("Kyle");
		System.out.println(myN);
		if (dupChar("ABCabc1")) {
			System.out.println("duplicate letter found");
		}
		else 
		{
			System.out.println("No duplicate!!");
		}
		dupCharCnt("ABCabc!123~!");
	}
	public Person(String personName) {
            name = personName;
    }
	public static String greet(String myName) {
		//Person p = new Person("Jlam");
		return String.format("Hi %s, my name is %s", name, myName);
	}
	public static Boolean dupChar(String inputString) {
		Boolean rtn = false;
		inputString = inputString.toLowerCase();
		Map<Character, Integer> charCntMap = new HashMap<>();
		char[] strArray = inputString.toCharArray();
		//System.out.println("dupcharfunction");
		for (char c : strArray) {
			//System.out.println(c);
			if (charCntMap.containsKey(c)) {
				//System.out.println(c);
				rtn = true;
				break;
			}
			else {
				charCntMap.put(c, 1);
			}
		}
		return rtn;
	}
	public static void dupCharCnt(String inputString) {
		inputString = inputString.toLowerCase();
		Map<Character, Integer> charCntMap = new HashMap<>();
		char[] strArray = inputString.toCharArray();
		for (char c : strArray) {
			if (charCntMap.containsKey(c)) {
				charCntMap.put(c, charCntMap.get(c)+1);
			}
			else {
				charCntMap.put(c, 1);
			}
		}
		Set<Character> charsInString = charCntMap.keySet();
		System.out.println("Duplicate Characters in:"+inputString);
		for (Character ch : charsInString) {
			if (charCntMap.get(ch) > 1) {
				System.out.println(ch + " : " + charCntMap.get(ch));
			}
		}
	}

}
