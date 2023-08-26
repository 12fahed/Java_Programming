/*
/*
KHAN FAHED JAVED
C21
28/07/2023
*/

import java.util.*;

class percantage{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Grade: ");
	char g= sc.next().charAt(0);
	if(g=='F')
	System.out.println("Percentage 0-60");
	
	else if(g=='D')
	System.out.println("Percentage 61-70");
	
	else if(g=='C')
	System.out.println("Percentage 71-80");
	
	else if(g=='B')
	System.out.println("Percentage 81-90");
	
	else if(g=='A')
	System.out.println("Percentage 91-100");
	
	else
	System.out.println("Invalid input");
	}
}


/*
student@LAB302PC21:~/Desktop$ javac percantage.java
student@LAB302PC21:~/Desktop$ java percantage
Enter the Grade: B
Percentage 81-90
*/
