import java.util.Scanner;

public class salary
{ 
 public static void main(String[] args)
  {  
    Scanner myObj= new Scanner(System.in);
    System.out.println("Enter basic salary:");
    float basic= myObj.nextFloat();
    Scanner myObj1= new Scanner(System.in);
    System.out.println("Enter employee name:");
    String emp_name=myObj1.nextLine();  
    
    int emp_no=30, cca=300, pt=70;
    float DA=(70*basic)/100, HRA=(30*basic)/100, PF=(10*basic)/100;
    float gross=DA+HRA+cca;
    float Net=gross-PF-pt;
    
    System.out.println("Name of employee:"+emp_name);
    System.out.println("Number of employees:"+emp_no);
    System.out.println("Basic salary:"+basic);
    System.out.println("Gross salary:"+gross);
    System.out.println("Net salary:"+Net);
  }
}