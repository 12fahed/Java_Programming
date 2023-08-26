import java.util.*;

class Employee {
    int id;
    String name;
    int nohrs;
    int wages;

    void getdata() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ID, Name and No. of Hours: ");
        id = s.nextInt();
        name = s.next();
        nohrs = s.nextInt();
        wages = nohrs * 100;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" + nohrs + "\t" + wages);
    }
}

class EmployeeMaxWages {
    void findMaxWages(Employee[] employees) {
        int max = employees[0].wages;
        int pos = 0;

        for (int i = 1; i < employees.length; i++) {
            if (max < employees[i].wages) {
                max = employees[i].wages;
                pos = i;
            }
        }

        System.out.println("Highest Wage Holder\nID: " + employees[pos].id + "\nName: " + employees[pos].name +
                           "\nNo. Hours: " + employees[pos].nohrs + "\nWages: " + employees[pos].wages);
    }
}

class EmpMain {
    public static void main(String args[]) {
        Employee e[] = new Employee[5];

        for (int i = 0; i < 5; i++) {
            e[i] = new Employee();
            e[i].getdata();
        }

        System.out.println("E-ID\tName\tNo. of Hours\tWages");

        for (int i = 0; i < 5; i++) {
            e[i].display();
        }

        EmployeeMaxWages maxWagesFinder = new EmployeeMaxWages(); 
        maxWagesFinder.findMaxWages(e);
    }
}
