package com.simplilearn.projecttest1.package1;

public class Program13 {

	public static void main(String[] args) {
		
		int count1 = 1;
		int count2 = 15;
		
		for (int i=1; i<=5; i++){
			for(int j=5; j>=i; j--) {
				System.out.print(count1);
				System.out.print("	");
				count1++;
			}
			System.out.println();// TODO Auto-generated method stub
		}
		for (int k=1; k<=5; k++){
			for(int m=1; m<=k; m++) {
				System.out.print(count2);
				System.out.print("	");
				count2--;
			}
			System.out.println();// TODO Auto-generated method stub
		}
		// TODO Auto-generated method stub

	}

}
