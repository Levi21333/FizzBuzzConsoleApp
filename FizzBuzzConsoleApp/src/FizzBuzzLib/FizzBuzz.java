package FizzBuzzLib;

public class FizzBuzz implements IFizzBuzz,IFizzBuzzRange {

	//Overriding the FizzBuzzifyAnInt() method
	//from the IFizzBuzz Interface
	public String FizzBuzzifyAnInt(int num) {
		if(num%3==0 && num%5!=0)
			return " Fizz ";
		else if(num%5==0 && num%3!=0)
			return " Buzz ";
		else if(num%3==0 && num%5==0)
			return " FizzBuzz ";
		else
			return " # ";
	}
	
	//Overriding the FizzBuzzValuesForRange() method
	//from the IFizzBuzzRange Interface
	public String [] FizzBuzzValuesForRange(int start,int end) {
		String [] range = new String [end-start+2];
		
		for(int count = start; count<range.length;count++) {
			range[count] = FizzBuzzifyAnInt(count);
		}
		return range;
	}
}
