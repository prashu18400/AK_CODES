package Strings;
import java.util.*;
import java.lang.*;
@SuppressWarnings("unused")
public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String d = "";
//		d = s.split(" ");
//		for(int i = d.length-1;i>=0;i--)
//			System.out.print(d[i]+" ");
		//the above code works if there are no trailing spaces and there is a single spave between words
		int i = s.length()-1;
		while(i>=0) {
			while(i>=0 && s.charAt(i)==' ')i--;
			int j = i;
			if(i<0)break;
			while(i>=0 && s.charAt(i)!=' ')i--;
			if(d.isEmpty())
				d = d.concat(s.substring(i+1,j+1));
			else
				d = d.concat(" "+s.substring(i+1,j+1));
		}
		System.out.println(d);
		
	}

}
