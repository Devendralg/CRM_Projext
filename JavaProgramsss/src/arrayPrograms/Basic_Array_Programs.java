package arrayPrograms;

import java.util.Arrays;

public class Basic_Array_Programs {

	public static void main(String[] args) 
	{
		int []a= {1,3,5,6,7};
	//	sizeOfAnArray(a);
	//	printArrayElements(a);
		averageOfElements(a);
		
	}

	private static void averageOfElements(int[] a)
	{
		int sum=0;
		for(int b:a)
		{
			sum +=b;
		}
		System.out.println(sum);
		int average = sum/a.length;
		System.out.println(average);
	}

	private static void printArrayElements(int[] a) {
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		for(int b:a)
		{
			System.out.print(b);
		}
		
		System.out.println();
		System.out.println(Arrays.toString(a));
	}

	private static void sizeOfAnArray(int []a) 
	{	System.out.println(a.length);
	}

}
