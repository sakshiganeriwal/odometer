import java.util.ArrayList;
import java.util.Scanner;

public class odometer {
	private static Scanner scanner;

	public static void main(String[] args){
		System.out.println(checkOdometer(1234));
		System.out.println(prevOdometer(134));
		System.out.println(nextOdometer(129));
		System.out.println(diffReading(1678,1789));
		scanner = new Scanner (System.in);
		System.out.print("Enter which operation: \n 1.Next Reading \n 2.Previous Reading \n 3.Difference in Reading:");  
		int name = scanner.nextInt();
		int num = 0;
		int result = 0;
		switch(name){
		case 1: 
			System.out.println("case1");
			num = scanner.nextInt();
			result = nextOdometer(num);
		case 2:
			num = scanner.nextInt();
			result = prevOdometer(num);
		case 3:
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			result = diffReading(num1, num2);
		default:
			System.out.println("wrong selection");
		}
		System.out.println(result);
	}
	
	public static void convertInt2Array(int guess, ArrayList<Integer> newGuess) {
		String temp = Integer.toString(guess);
		for (int i = 0; i < temp.length(); i++)
		{
		    newGuess.add(temp.charAt(i) - '0');
		}
	  }
	
	public static boolean checkOdometer(int number)
	{
	ArrayList<Integer> newGuess = new ArrayList<Integer>();
	convertInt2Array(number,newGuess);
	for (int i = 0; i < newGuess.size() - 1; i++) {
	        if (newGuess.get(i) >= newGuess.get(i + 1)) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static int nextOdometer(int n){
		n = n + 1;
		while(!checkOdometer(n)){
			n = n + 1;
		}
		return n;
	}
	public static int prevOdometer(int n){
		n = n - 1;
		while(!checkOdometer(n)){
			n = n - 1;
		}
		return n;
	}
	public static int diffReading(int n1, int n2){
		int count = 0;
		while(n2 > n1){
			n1 = nextOdometer(n1);
			count++;
		}
		return count;
	}
	

}
