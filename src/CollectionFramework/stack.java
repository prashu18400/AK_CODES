package CollectionFramework;
import java.util.*;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<String>();
		//unlike add, remove methods in ArrayList and Vectors here push and pop ethods are available
		st.add("Hi,");
		st.add("My name is");
		st.add("Prashanth");
		Iterator<String> itr = st.iterator(); //to traverse the stack
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}

}
