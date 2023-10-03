package pro.co.in;

public class OddOrEven {

	public static void main(String[] args) {
		int even = 0;
		int odd = 0;
		int evencount = 0;
		int oddcount = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				even=even+1;
				evencount = i + evencount;
			} else {
				odd=odd+1;
				oddcount = i + oddcount;
			}

		}
		System.out.println("Evencount:" + even);
		System.out.println("oddcount:" + odd);
		System.out.println("Sum of Even:" + evencount);
		System.out.println("Sum of odd:" + oddcount);
	}

}
