package Strings;
import java.util.*;
@SuppressWarnings("unused")
public class String1 {
	public static void main(String[] args) {
		String s = "Prashanth";
		String s1 = "Prashanth";
		String s2 = new String("Prashanth");
		/*While declaring a string with literal it checks the string pool area if that string is jot present
		it creates Prashanth in pool area, now s1 is pointed to same location 
		s2 is created with string class so it creates a string in heap area compulsary and in pool area 
		depends*/
		System.out.println(s.length());
		System.out.println(s.substring(2,7));
		//contains is a method used as 'in' in python
		System.out.println(s.contains("Pra"));
		System.out.println(s.equals(s2)); // == is not much reliable so we .equals method is most preferable
		String cars = "Maruti,BMW,Hyundai";
		String[] allcars = cars.split(",");
		for(String e:allcars)
			System.out.println(e);
		System.out.println(s2.indexOf('n'));  //toLowerCase , toUpperCase
	}
}