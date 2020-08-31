import java.util.*;
public class PrimeNum {
	public static void main(String [] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		boolean isprime = true;
		for(int i=2;(i*i)<=n;i++) {
			if(n%i == 0) {
				isprime = false;
				break;
			}
		}
		if(n<2)
			isprime = false;
		if(isprime)
			System.out.println("Is a prime number");
		else
			System.out.println("Is not a prime number");
	}

}
