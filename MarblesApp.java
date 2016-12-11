import java.util.Scanner;

public class MarblesApp{
	static Integer totalMarbles;
	static Integer totalChildren;

	static Integer marblesPerChild;
	static Integer marblesLeftOver;

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]){
		System.out.print("Input Total Numer of Marbels: ");
		totalMarbles = sc.nextInt();

		System.out.print("Input Total Numer of Children: ");
		totalChildren = sc.nextInt();

		marblesPerChild = totalMarbles / totalChildren;
		marblesLeftOver = totalMarbles % totalChildren;

		System.out.println("Marbles Per Child : " + marblesPerChild);
		System.out.println("Marbles Left Over : " + marblesLeftOver);

	}

}
