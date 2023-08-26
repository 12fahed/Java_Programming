import java.util.*;

class NumberA
{
    private int x1, x2, x3;
    public void acceptData()
    {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 3 Number: ");
		int x1= s.nextInt();
		int x2= s.nextInt();
		int x3= s.nextInt();

       	int p=calculateMax(x1,x2,x3);
		System.out.println("Max: "+p); 

    }

    public int calculateMax(int x1, int x2, int x3)
    {
        return (x1>x2)?(x1>x3?x1:x3):(x2>x3?x2:x3);
    }
}

public class MaxOf3 {
    public static void main(String[] args)
    {
        NumberA processor = new NumberA();
        processor.acceptData();
    }
}
