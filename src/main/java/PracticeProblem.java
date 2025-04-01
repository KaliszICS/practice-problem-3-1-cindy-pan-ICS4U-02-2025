public class PracticeProblem {

	public static int sumOfDigits(int x){
	String temp = Integer.toString(x);
	int index =0;
	if (x<0){
		x = x*(-1);
	}


	if (index>= temp.length()){
		return 0;
	} 
	else if (temp.length() ==1){
		return x;
	}
	else {
		return (x%10) + sumOfDigits(x/10);
	}
	}


	public static int factorial(int n){
		if (n<0){
			return 0;
		}
		else if (n>0){
			return n * factorial(n-1);
		}
		else {
			return 1;
		}
	}
	

}
