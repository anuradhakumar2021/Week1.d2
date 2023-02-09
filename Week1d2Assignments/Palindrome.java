package week.d2.Assignments;

public class Palindrome {

	public static void main(String[] args) {
		int num = 34343;
		int num1 =num;
		int temp = 0;
		for (int i = 0; i <=4; i++) {
			temp = temp*10 + num%10;
			num = num/10;
		}
        if (num1 == temp) {
	          System.out.println("Yes, It is a palindrome");
        }else {
	          System.out.println("No, It is not a palindrome");
        }
	}

}
