import java.util.Scanner;
class Subtraction
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    System.out.println("Subtraction of two numbers is : "+(num1-num2));
  }
}