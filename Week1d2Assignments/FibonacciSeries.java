package week.d2.Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 8;
		int res, firstNum = 0,secondNum = 1;
		for (int i = 0; i < num; i++) {
			res = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = res;
			System.out.println(res);
		}

	}

}
