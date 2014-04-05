package calculator1;

public class Cal {

	public static void main(String[] args) {
		
		add(2,3);
		sub(4,6);
		mul(3,4);
		div(7,3);
		
		// TODO Auto-generated method stub

	}
	
	public static void add(int a,int b){
		double res=a+b;
		System.out.println("The addition is:"+res);
	}
	
	public static void sub(int a, int b){
		int res=a-b;
		System.out.println("the subtraction is:"+res);
	}
	
	public static void mul(int a,int b){
		int res=a*b;
		System.out.println("the multiplication is:"+res);
	}
	
	public static void div(double a,double b){
		double res=a/b;
		System.out.println("the divisioN is:"+res);
	}

}
