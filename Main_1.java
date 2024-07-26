import java.util.*;
public class Main_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd value: ");
		int b = sc.nextInt();	
		System.out.println("Addition of 2 numbers is: " + (a + b));
		System.out.println("Subtraction of 2 numbers is: " + (a - b));
		// Write below

		if(a > b){
			System.out.println(a + "is greater);
		}
		else{
			System.out.println(b + "is greater);
		}

	}	
}
