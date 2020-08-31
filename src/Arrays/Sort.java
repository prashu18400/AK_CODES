package Arrays;
import java.util.*;
public class Sort {
	public static void main(String[] args) {
		int[] a = {10,7,11,9,5};
		int n = a.length;
		System.out.println(n);
		Arrays.sort(a);//sorting in java Arrays.sort method is used
		for(int e:a)
			System.out.print(e+" ");
	}
}
