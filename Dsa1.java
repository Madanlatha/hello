package Array;

import java.util.Scanner;

//Collatz
public class Dsa1 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n=sc.nextInt();
		//int ar[]=new int[n];
		do {
			System.out.println(n);
			if(n%2==0) {
				n=n/2;
			}
			else {
				n=(3*n)+1;
			}
		}while(n>1);
		System.out.println(n);

	}

}
