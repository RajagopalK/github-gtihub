package junit;

public class Sub {
 int a,b;
 String c,d;
 
	public Sub(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}

	public Sub(String c, String d) {
		super();
		this.c = c;
		this.d = d;
	}
public int subtraction() {
	return a-b;
}
public String combine() {
	return c+d;
}
	public static void main(String[] args) {
		Sub s1 = new Sub(5,3);
		Sub s2 = new Sub("Rajagopal",".K");
System.out.println("Difference:"+s1.subtraction());
System.out.println("Combine:"+s2.combine());
	}

}