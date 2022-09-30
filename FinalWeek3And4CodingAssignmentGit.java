package week4Java;

public class FinalWeek3And4CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array Portion of Coding Assignment");
		System.out.println("-----------------------------------------------------------------");
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int subtract = ages[ages.length-1] - ages[0];
		System.out.println("This is the answer to subtract the value of the first element to the last: " + subtract);
		
		int sum = 0;
		for( int i = 0; i < ages.length; i++) {
			sum += ages[i];} 
			int average = sum / ages.length;
			System.out.println("This is the answer to the average age in the array is: " + average);
		
	/** Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
*/
				String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			int sumOfLetters = 0;
				for ( String letters : names) {
				sumOfLetters += letters.length();}
				int avgOfLetters = sumOfLetters / names.length;
				System.out.println("This is the average number of letters per name: " + avgOfLetters);
				
				
				
					for (String firstName : names) {
					System.out.print(firstName.concat(" "));
				}
					System.out.println("");
					System.out.println("This is the last element of the array: " + names[names.length-1]);
					System.out.println("This is the first element of the array: " +names[0]);

				
					int[] nameLengths = new int[names.length];
					for (int i = 0; i < names.length; i++) {
						nameLengths[i] = names[i].length();
						System.out.println("These are the names and lengths: " + names[i] + " " + nameLengths[i] + " ");
						 }				 
					
					int sumOfNameLengths = 0;
				for (int number : nameLengths) {
					sumOfNameLengths += number;}
					System.out.println("This is the sum of all the name lengths: " + sumOfNameLengths);
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Method Portion of the Coding Assignment");
					
					
					
					int[] array = {20, 30, 60};
					double[] array2 = {3.5, 4.25, 5.75, 6.5};
					double [] array3 = {2.5, 3.25, 4.75, 5.5};
					boolean isHotOutside = true;
					double moneyInPocket = 25.00;
					double[] milesBikedInMi = {6.06, 10.19, 8.90, 9.41, 9.27, 19.31};
					
					
					System.out.println("This is the concatenation of word with itself by n times: " + createRepeatOfWord("Hello", 5));
					System.out.println("This is the creation of a full name between two Strings: " + createFullName("Heinz", "Lemon"));
					System.out.println("Is the sum of this array greater than 100: true or false? " + isSumOfArrayGreater(array));
					System.out.println("The average of array2 is: " + createAverageOfArray(array2));
					System.out.println("Is the average of array2 greater than the average of array3: true or false? " + isArray2GreaterThanArray3(array2, array3));
					System.out.println("Is it hot outside, and do I have more than 10.50 in my pocket, will I buy a drink: true or false? " + willBuyDrink(isHotOutside, moneyInPocket));
					System.out.println("The average kilometers per ride is: " + milesToAverageKilometers(milesBikedInMi) + "km");
					System.out.println("-----------------------------------------------------------------");
				}
				public static String createRepeatOfWord(String word, int num) {
					String result = "";
					for (int i = 0; i < num; i++) {
						result += word;
					}
					return result;
				}
				public static String createFullName(String firstName, String lastName) {
					String fullName = "";
					fullName = firstName + " " + lastName;
					return fullName;
				}
				public static boolean isSumOfArrayGreater(int[] array) {
					int sum = 0;
					for (int number : array) {
						sum+= number;
						if (sum > 100) {
							return true;
							}
						
						}
					
						return false;}
				public static double createAverageOfArray(double[] array2){
					double sumOfArray2 = 0;
				for (double number : array2) {
					sumOfArray2+= number;
					
					
				}
					return sumOfArray2 / array2.length;	}
				public static boolean isArray2GreaterThanArray3(double[] array2, double[] array3){
					if(createAverageOfArray(array2) > createAverageOfArray(array3)) {
						return true;

			}
				return false;
			}
				public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
					if(isHotOutside == true && moneyInPocket > 10.50) {
						return true;
						
					}
					return false;
				}
				public static double milesToAverageKilometers(double[] milesBikedInMi) {
					double sum = 0;
					double sumKm = 0;
					for(double miles : milesBikedInMi) {
						sum += miles;
						sumKm = sum * 1.609344;
						
						
					}
					return sumKm / milesBikedInMi.length;
	}

}
