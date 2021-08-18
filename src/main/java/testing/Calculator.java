package testing;

public class Calculator {
	public int add(int a , int b) {
		return a+b;
	}
	
	public float add(float a , float b) {
		if(a>2){
			System.out.println("cover this code");
		}else {
			System.out.println("else if not written means 1 branch is missing");
		}
		return a+b;
	}
	
	public double divide(int a , int b) {
		return a/b;
	}
}
