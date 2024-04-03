/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber
{
	public static void main(String[] args) {
		System.out.println("Enter a three digit number");
		Scanner in =new Scanner(System.in);
		int a=in.nextInt();
		int sum=0;
		while(a>0){
		    int rem=a%10;
		    double cube=Math.pow(rem,3);
		     sum+=cube;
		    a=a/10;
		    
		}
		System.out.println(sum);
	}
}
