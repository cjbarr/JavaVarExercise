
public class VarClass {

	public static void one() {
		int n = 1;
		int o = 2;
		int p = n + o;
		System.out.println(p);
	}

	public static void two() {
		double a = 1.0;
		double b = 1.3;
		double c = a + b;
		System.out.println(c);
	}

	public static void three() {
		int d = 3;
		double e = 4.1;
		double f = d + e;
		System.out.println(f);
	}

	public static void four() {
		int g = 4;
		double h = 5.0;
		double i = h / g;
		System.out.println(i);
	}

	public static void five() {
		double j = 3;
		double k = 4;
		double l = k / j;
		System.out.println(l);
		int m = (int) l;
		System.out.println(m);
	}

	public static void six() {
		int x = 5;
		int y = 6;
		int q = y / x;
		System.out.println(q);
		// double q = (double) y
		// unable to assign/cast due to error
	}

	public static void seven() {

		int r = 1;
		final int S = 2;
		System.out.println(r + S);
	}

	public static void eight() {
		double coffee = 1.00;
		double tea = 1.25;
		double water = 4.00;
		double subtotal = 0;
		double totalSale = 0;
		subtotal = (3 * coffee + 4 * tea + 2 * water);
		final double SALES_TAX = 1.0025;
		totalSale = SALES_TAX * subtotal;
		System.out.println(totalSale);
	}

	public static void main(String[] args) {

		one();
		two();
		three();
		four();
		five();
		six();
		seven();
		eight();

	}

}
