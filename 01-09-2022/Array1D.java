//WAP to input an array having 5 strings and display them

package Array;
import java.util.Scanner;
public class Array1D {
public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 int size,i;
	 System.out.println("Enter the elements you want to insert ");
	 size=sc.nextInt();
	 String arr[]=new String[size];
	 System.out.println("Enter the elements one by one ");
	 for(i=0;i<size;i++) {
		 arr[i]=sc.next();
	 }
	 
	 System.out.println("Print the array");
	 for(i=0;i<size;i++) {
		 System.out.println(arr[i]);

	 }

	 
}
}