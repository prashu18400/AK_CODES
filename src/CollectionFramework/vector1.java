package CollectionFramework;
import java.util.*;
public class vector1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for(int i=1;i<5;i++)
			v.add(i);
		System.out.println(v);
	}	
	/*Implementation of vectors is similar to that of ArrayList whereas vectors are used where there are 
	 many Array manipulations and the methods in vectors are Synchronized*/
}
