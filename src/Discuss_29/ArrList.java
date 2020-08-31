package Discuss_29;
import java.util.*;
public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> l = new ArrayList<>();
		l.add(1);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(2);
		l.add(l1);
		int a = 1;
		ArrayList<Integer> d = new ArrayList<>();
		
		System.out.println(l);
		System.out.println(l.get(a));

	}

}
