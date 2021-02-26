
public class Op_Num_BARR {

	// decimal to Binary Question 1
	// 1 : 0000 0001
	// 8 : 0000 1000
	// 33 : 0010 0001
	// 78 : 0011 0001 0011
	// 787 : 0011 0001 0111
	// 33987 : 0100 0010 0110 00011

	// Binary to decimal Question 2

	// 0010: 2
	// 1001: 9
	// 0011 0100: 52
	// 0111 0010: 114
	// 0010 0001 1111: 543
	// 0010 1100 0110 0111: 11367

	//QUESTION 3
	public static void prog1() {
		int x = 2;
		System.out.println("Prog 1 Starting Int " + Integer.toBinaryString(x));
		x = x << 1;
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));

	}

	//QUESTION 4
	public static void prog2() {
		int x = 150;
		System.out.println("Prog 2 Starting Int " + Integer.toBinaryString(x));
		x = x >> 2;
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
	}

	//QUESTION 5
	public static void prog3() {
		int x = 7;
		int y = 17;
		int z = x & y;
		System.out.println("This is my & bitwise: " + z);
		z = x | y;
		System.out.println("This is my | bitwise: " + z);

	}

	//QUESTION 6
	public static void prog4() {
		int x = 2;
		System.out.println("Before postfix: " + x);
		x++;
		System.out.println("After postfix: " + x);

	}

	//QUESTION 7
	public static void prog5() {
		int x = 1;
		System.out.println("Pre X: " + x);
		x = x << 1;
		System.out.println("Post add+1: " + x);
		x = x + 1;
		System.out.println("Post add+1: " + x);
		x++;
		System.out.println("Post add+1: " + x);
	}

	//QUESTION 8
	public static void prog6() {
		int x = 5;
		int y = 8;
		int sum = ++x + y;
		System.out.println("sum pre: " + sum);
		x = 5;
		y = 8;
		sum = y + x++;
		System.out.println("sum post: " + sum);
	}

	public static void main(String[] args) {


		prog1();
		prog2();
		prog3();
		prog4();
		prog5();
		prog6();

	}

}
