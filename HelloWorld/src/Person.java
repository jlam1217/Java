import java.util.*;
public class Person {

	public static String myN;
	public static String name;
	public static void main(String[] args) {
		int[] duplicatesInOrder1 = new int[0];// {1, 2, 3, 3};//, 2, 1, 2, 3, 1, 1, 3, 2};
		int[] rtn = new int[duplicatesInOrder1.length];
		rtn = unique(duplicatesInOrder1);
		/*myN = greet("Kyle");
		System.out.println(myN);
		if (dupChar("ABCabc1")) {
			System.out.println("duplicate letter found");
		}
		else 
		{
			System.out.println("No duplicate!!");
		}
		dupCharCnt("ABCabc!123~!");
		*/
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
	
	public static int[] unique(int[] integers) {
		int[] u = new int[integers.length];
		int x = 0;
		
		for(int i=0; i < integers.length; i++) {
			x = integers[i];
			if (!dupNum(x, u)) {
				u[i] = x;
			}
		}
		int[] v = new int[u.length];
		for(int y = 0; y < u.length; y++) {
			v[y] = u[y];
		}
		return v;
	}
	public static boolean dupNum(int x, int[] dupN) {
		boolean rtn = false;
		for (int y : dupN) {
			if (x == y) {
				rtn = true;
				break;
			}
		}
			
		return rtn;
	}
	public static int[] unique2(int[] integers) {
		
		int[] k = new int[] {};
		int j = 0;
		Map<Integer, Integer> numCntMap = new HashMap<>();
		for (int c : integers) {
			if (numCntMap.containsKey(c)) {
				continue;
			}
			else {
				numCntMap.put(c, 1);
				k[j] = c;
				j++;
			}
		}
		return k;
	}
}
