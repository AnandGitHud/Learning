package programs;

import java.util.Scanner;
// palidrome of a number 
public class Palidrome {

	public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner n= new Scanner (System.in);
	int num= n.nextInt();
	int rem,rev=0,temp;
	temp=num;
	//while loop
	while (temp>0) {
		rem=temp%10;
		 rev=rev*10+rem;
		temp=temp/10;
		
	}
	//if statements
	if(num==rev) {
		System.out.println("palidrome number");
		
	}
	else {
		System.out.println("not palidrome number");
	}
			

	}

}

