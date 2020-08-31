package CollectionFramework;

import java.util.*;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A map is identical t that of dictionaries in python. It stores the values as key,value pairs */
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Prashanth");
		hm.put(2, "Pranavi");
		for(Map.Entry<Integer,String> e: hm.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
	}

}
