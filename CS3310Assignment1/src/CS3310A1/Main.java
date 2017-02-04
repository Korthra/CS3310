package CS3310A1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Arrays;

public class Main {
	static Random rn = new Random();

	public static void main(String[] args) {
		float randomArray[] = random(10, 10);
		for (int i = 0; i < randomArray.length; i++) {
			System.out.println(randomArray[i]);
		}
		Arrays.sort(randomArray);

	}

	public static float[] random(int n, int m)
	{
		//Creates random number in array using n as the limit of spots in the array with a max number
		//for numbers to be created being m
		float randomArray[] = new float[n];
		for (int i=0; i < randomArray.length; i++)
		{
		randomArray[i] = rn.nextInt(m - 1 + 1) + 1;
		}
				
		return randomArray;		
	}

	public static boolean iterativeBinarySearch(float[] sortedArray)
	{
		float x = rn.nextFloat();
		
		return true;
	}


}
