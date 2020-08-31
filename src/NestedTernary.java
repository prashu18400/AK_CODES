import java.util.*;
public class NestedTernary {
		public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a,b,c,max;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		max = a>b?a>c?a:c:b>c?b:c;
		System.out.println(max);
				
	}
}
