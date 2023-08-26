import java.util.*;

class dimen2 {

    void getdata() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Row and Column Size: ");
        int r = s.nextInt(); 
        int c = s.nextInt(); 
        int a[][] = new int[r][c];
        System.out.println("Enter the Elements of Matrix: ");

        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = s.nextInt();
            }
        }

        sum(a); 
    }

    void sum(int a[][]) {
        int s = 0;
        if (a.length == a[0].length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    if (i == j) {
                        s = s + a[i][j];
                    }
                }
            }

            System.out.println("Sum of the Diagonal Elements: " + s);
        } else {
            System.out.println("It's not a Square Matrix"); 
        }
    }

    public static void main(String args[]) {
        dimen2 ab = new dimen2();
        ab.getdata();
    }
}
