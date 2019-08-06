package week2;

public class HornerMethod {
	
	public static void main(String[] args) {
		
		// the polynomial x^5 + 5x^3 + 10x^2 + x + 5
		int[] f = {5, 1, 10, 5, 0, 1};
		
		System.out.println("f(5) = " + eval_slow(f,5,f.length-1));
		System.out.println("f(10) = " + eval_slow(f,10,f.length-1));

		t = 1;
		System.out.println("f(5) = " + eval(f,5,f.length-1));
		t = 1;
		System.out.println("f(10) = " + eval(f,10,f.length-1));

		System.out.println("f(5) = " + horner(f,5,0));
		System.out.println("f(10) = " + horner(f,10,0));
	}
	
	public static int horner(int[] f, int x, int i) {
		
		// base case
		if (i == f.length-1) {
			return f[i];
		}
		
		return f[i] + x * horner(f, x, i+1);
	}
	
	/*
	public static int eval(int[] f, int x, int i, int t) {
		if (i == 0) {
			return f[0];
		}
		
		return f[i] * t + eval(f,x,i-1,t*x);
	}
	*/
	
	public static int t;
	public static int eval(int[] f, int x, int i) {
		if (i < 0) {
			return 0;
		}

		int val = eval(f,x,i-1) + t * f[i];
		t = t * x;
		return val;
	}
	
	public static int eval_slow(int[] f, int x, int i) {
		if (i == 0) {
			return f[0];
		}
		int t = 1;
		for (int j = 1; j <= i; j++) {
			t = t * x;
		}
		return f[i] * t + eval_slow(f,x,i-1);
		
	}

}
