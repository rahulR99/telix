package main;

public class Que8FindSum {
	    int FindMaxSum(int arr[], int n) 
	    {
	        int var = arr[0];
	        int var1 = 0;
	        int new_var;
	        for (int i = 1; i < n; i++) 
	        {
	            new_var = (var > var1) ? var : var1;
	 
	            var = var1 + arr[i];
	            var1 = new_var;
	        }
	 
	        return ((var > var1) ? var : var1);
	    }
	    public static void main(String[] args) 
	    {
	    	Que8FindSum sum = new Que8FindSum();
	        int arr[] = new int[]{5, 5, 10, 100, 100, 15};
	        System.out.println(sum.FindMaxSum(arr, arr.length));
	    }
	}
	 

