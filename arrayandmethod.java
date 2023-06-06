package week4codingassignment.java;

public class arrayandmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
//				1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
				int[] age = {3, 9, 23, 64, 2,  8, 28, 93};
				
				System.out.println("----Question 1 a----");
				
//				a.	Programmatically subtract the value of the first element in the array from the value in the last element
//				of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
				int newAge = age[age.length-1] - age[0];
					System.out.println(newAge);
					
					System.out.println("----Question 1 a----");
					
//		        b.	Add a new age to your array and repeat the step above to ensure it is dynamic 
//				(works for arrays of different lengths).
					int[] age2 = {3, 9, 23, 64, 2,  8, 28, 93, 45};
					int newAge2 = age2[age2.length-1] - age2[0];
					System.out.println(newAge2);
					
					System.out.println("----Question 1 c----");
					
//				c.	Use a loop to iterate through the array and calculate the average age. 
//				Print the result to the console.
				int sumAge = 0; 
				for (int i =0; i < age.length; i ++) {
					sumAge += age[i];
				}
				int averageAge = sumAge / age.length;
					System.out.println(averageAge);
					
					
//				2.	Create an array of String called names that contains the following values: 
				//“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
				String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
				
				System.out.println("----Question 2 a----");
				
//				a.	Use a loop to iterate through the array and calculate the average number of letters per name. 
//				Print the result to the console.
				int sumOfLetters = 0;
				for (String name : names) {
					sumOfLetters += name.length();
				}
				int averageLetter = sumOfLetters / names.length;
					System.out.println(averageLetter);
				
					System.out.println("----Question 2 b----");
					
//					b.	Use a loop to iterate through the array again and concatenate all the names together, 
//					separated by spaces, and print the result to the console.

					String result = "";
					for (int i = 0; i < names.length; i++ ) {
						result += names[i]+ " ";
						}
					System.out.println(result);
					
					System.out.println("----Question 3----");
					
//					3.	How do you access the last element of any array?
					System.out.println(names[names.length-1]);
					
					System.out.println("----Question 4----");
					
//					4.	How do you access the first element of any array?
					System.out.println(names[0]);
					
					System.out.println("----Question 5----");
//					5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously 
//					created names array and add the length of each name to the nameLengths array.
					int[] nameLengths = new int[names.length];
					 for ( int i =0; i < names.length; i ++ ) {
						 nameLengths [i] = names[i].length();
						 System.out.println(names[i] + " "  + nameLengths[i]);
					 }
					 System.out.println("----Question 6----");

//					6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the 
//					 elements in the array. Print the result to the console.
					 int resultNameLength = 0;
					 for ( int i =0; i < nameLengths.length; i ++) {
						 resultNameLength += nameLengths[i];
					 }
					 System.out.println(resultNameLength);
					 
					 System.out.println("----Question 7----");
					 
	}				 
//					7.	Write a method that takes a String, word, and an int, n, as arguments and returns the 
//					 word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3,
//					I expect the method to return “HelloHelloHello”).
					 public static void wordCocatenate(String word, int n) {
						 String words = "";
						  for ( int i =0; i < n; i++) {
							 words += n;
						 }
						 System.out.println(words);
					 }
					 
					 
					 
//					8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
//					 (the full name should be the first and the last name as a String separated by a space).
					 public static String getFullName(String firstName, String lastName) {
						 
					 return firstName + " " + lastName;
					 }
//					9.	Write a method that takes an array of int and returns true if the sum of all the ints 
//					 in the array is greater than 100.
					 public static boolean sumOfInt( int[] array) {
						 int totalInts =0;
						 for( int num: array) {
							 totalInts += num;
							 if ( totalInts > 100);
						 }
						 return true;
					 }
					 
//					10.	Write a method that takes an array of double and returns the average of all the elements 
//					 in the array.
					 public static double aveageOfElements( double[] doubleArray) {
						 int doubleTotal =0;
						 for (double number : doubleArray) {
							 doubleTotal += number;
							  
						 }
						 return doubleTotal/doubleArray.length;
					 }
					 
//					11.	Write a method that takes two arrays of double and returns true if the average of the elements
//					 in the first array is greater than the average of the elements in the second array.
					 public static void aveageOfTwoElements(double firstAverage, double secondAverage) {
						 if ( firstAverage > secondAverage) {
							 return;
						 }
}									
//					12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
//					 and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
					 public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
						 if( isHotOutside == true && moneyInPocket > 10.50) {
						 return true;
					 }else{
					 return false;
						 }
					 }
					 
//					13.	Create a method of your own that solves a problem. In comments, 
//					 write what the method does and why you created it.
					 // cause i wanted a easy one 
					 static int squarePerimeter(int length, int width) {
							
							return 2 * (length + width);
						}
					 
	}


