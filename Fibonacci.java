import java.util.Scanner;
public class Fibonacci{
  public static void main(String[] args){
    int x=0, y=1, z;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int a= sc.nextInt();
    System.out.println(x+" " +y);
    for( int i = 1; i <= a ; i ++){
      z=x+y;
      System.out.println(z+" ");
      x=y;
      y=z;
    }
  }
}
                       
  
  
