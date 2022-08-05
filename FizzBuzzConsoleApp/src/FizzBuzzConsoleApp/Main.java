package FizzBuzzConsoleApp;


import FizzBuzzLib.FizzBuzz;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This variable result is an instance FizzBuzz Class
		FizzBuzz result = new FizzBuzz();
		
		//Iterate over range from 1 to 100 
		String [] show = result.FizzBuzzValuesForRange(1, 100);
		
		//Bounds from start to end
		
		//i = start and i < space difference
		for (int i = 1;i<=100;i++) {
			System.out.print(show[i]+" ");
		}
		
		
		

	}

}
