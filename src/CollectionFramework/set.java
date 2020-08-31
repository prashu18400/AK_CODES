package CollectionFramework;
import java.util.*;
public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> st = new HashSet<Integer>();
		/*The HashSet class is an inherent implementation of the hash table data structure. 
		 * The objects that we insert into the HashSet do not guarantee to be inserted in the same order. 
		 * The objects are inserted based on their hashcode. 
		 * This class also allows the insertion of NULL elements*/
		st.add(13);
		//st.get(0);  As the values are stored according to hash values we can't access them by indices
		Iterator<Integer> itr = st.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		/*A linked hashset is similar to that of Hash set but it uses a doubly linked list to store the data
		 and retains the ordering of elements */
		LinkedHashSet<String> s1 = new LinkedHashSet<String>();
		s1.add("Prashanth");
		s1.add("Pranavi");
		System.out.println(s1);
		/*Tree set class uses tree for storage of elements. The ordering of elements is maintained by using
		 a set using their natural ordering */
		TreeSet<String> s2 = new TreeSet<String>();
		s2.add("Shobha Rani");
		s2.add("Raj Kumar");
		System.out.println(s2);
	}

}
