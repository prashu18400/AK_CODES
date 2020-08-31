package CollectionFramework;

public class Pairs<X,Y> {
	X x;
	Y y;
	Pairs(X x,Y y) {
		this.x = x;
		this.y = y;
	}
	public void getdescription() {
		// TODO Auto-generated method stub
		System.out.println(x+" "+y); 
	}
}
