/*
KHAN FAHED JAVED
C21 2203079
14/08/2023
*/

import java.util.*;
class emp
{
	void getdata()
	{
		Scanner s= new Scanner(System.in);
		int eid;
		String ename;
		double esal;
		System.out.println("Enter ID: ");
		eid=s.nextInt();
		System.out.println("Enter Name: ");
		ename=s.next();
		System.out.println("Enter Salary: ");
		esal=s.nextDouble();
		
		display(eid, ename, esal);
	
	}
	
	void display(int eid, String ename, double esal)
	{
		System.out.println("ID: "+ eid);
		System.out.println("Name: "+ ename);
		System.out.println("Salary: "+ esal);
	
	}
	
	public static void main(String[]args)
	{
		emp e= new emp();
		e.getdata();
	}
}

/*OUTPUT
student@LAB302PC35:~/Desktop$ javac emp.java
student@LAB302PC35:~/Desktop$ java emp
Enter ID: 
12
Enter Name: 
Fahed
Enter Salary: 
10000
ID: 12
Name: Fahed
Salary: 10000.0
*/
