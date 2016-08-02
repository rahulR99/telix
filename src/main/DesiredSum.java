package main;

import java.util.ArrayList;
import java.util.Scanner;

public class DesiredSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter the size of list....");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in the list");
		for(int i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the desired sum....\n");
		long desiredSum=sc.nextLong();
		System.out.println("\nPair for desired sum");
		int counter=0;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(a[i]+a[j]==desiredSum){
					System.out.println("{"+a[i]+","+a[j]+"}");
					counter++;
				}
			}
		}
		if(counter==0){
			System.out.println("There is no pair for the desired sum");
		}
		
	}

}
