
import java.util.*;

public class UniqueArray {
  public static int[] unique(int[] integers) {
    ArrayList<Integer> u = new ArrayList<Integer>();
    int x = 0;
	for(int i=0; i < integers.length; i++) {
		x = integers[i];
		if (!dupNum(x, u)) {
			u.add(x);
		}
	}
	
	int[] v = new int[u.size()]; 
	int cnt = 0;
	for (Integer n : u) {
		v[cnt++] = n.intValue();
	}
	
	return v;
  }
  
  public static boolean dupNum(int x, ArrayList<Integer> dupN) {
	boolean rtn = false;
	for (int y : dupN) {
		if (x == y) {
			rtn = true;
			break;
		}
	}
		
	return rtn;
  }
}