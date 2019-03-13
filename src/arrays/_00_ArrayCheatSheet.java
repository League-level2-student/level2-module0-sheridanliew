package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stringArray = new String[5];
		//2. print the third element in the array
		System.out.println(stringArray[2]);
		//3. set the third element to a different value
		stringArray[2] = "String";
		//4. print the third element again
		System.out.println(stringArray[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		System.out.println("~");
		
		//6. make an array of 50 integers
		int[] intArray = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random random = new Random();
		for (int i = 0; i < intArray.length; i++) {
			int r = random.nextInt(50);
			intArray[i] = r;
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestInt = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i]<smallestInt) {
				smallestInt = intArray[i];
			}
		}
		System.out.println(smallestInt);
		//9. print the entire array to see if step 8 was correct
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		//10. print the largest number in the array
		int largestInt = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i]>largestInt) {
				largestInt = intArray[i];
			}
		}
		System.out.println(largestInt);
	}
}
