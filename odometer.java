import java.util.ArrayList;

public class odometer {
	
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
	if(newGuess.size() > 1 && newGuess.size() < 9){
		for (int i = 0; i < newGuess.size() - 1; i++) {
	        if (newGuess.get(i) >= newGuess.get(i + 1)) {
	            return false;
	        }
	    }
	    return true;
	}
	else
		return false;
	
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
