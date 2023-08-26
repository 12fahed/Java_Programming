class Number{
  public static void main(String arrys[]){
    int x = Integer.parseInt(arrys[0]);
    int y = Integer.parseInt(arrys[1]);
    int z = Integer.parseInt(arrys[2]);
    
    System.out.println("x: "+arrys[0] + "\ny: "+ arrys[1] + "\nz: "+ arrys[2]);
    
    if(x>y){
      if(x>z){
        System.out.print("\n\nLargest is X: "+x);
      }
      
      else{
        System.out.print("\n\nLargest is Z: "+z);
    }
    }
    
    else if(y>x){
      if(y>z){
        System.out.print("\n\nLargest is Y: "+y);
      }
      else{
        System.out.print("\n\nLargest is Z: "+z);
      }
    }
    
    //SMALLEST
    if(x<y){
      if(x<z){
        System.out.print("\n\nSmallest is X: "+x);
      }
      
      else{
        System.out.print("\n\nSmallest is Z: "+z);
    }
    }
    
    else if(y<x){
      if(y<z){
        System.out.print("\n\nSmallest is Y: "+y);
      }
      else{
        System.out.print("\n\nSmallest is Z: "+z);
      }
    }
 }
}


//OUTPUT
/*
student@LAB703PC11:~$ cd Desktop
student@LAB703PC11:~/Desktop$ cd C21_Fahed
student@LAB703PC11:~/Desktop/C21_Fahed$ javac Number.java
student@LAB703PC11:~/Desktop/C21_Fahed$ java Number 45 65 10
x: 45
y: 65
z: 10


Largest is Y: 65

Smallest is Z: 10
*/

