//WAP to input an array having 5 strings and display the

package Array;
import java.util.Scanner;
public class Array2D {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int sizerow,sizecol,i,j;
		 System.out.println("Enter the row  ");
		 sizerow=sc.nextInt();
		 System.out.println("Enter the column  ");
		 sizecol=sc.nextInt();
		 String arr[][]=new String[sizerow][sizecol];
		 System.out.println("Enter elements one by one ");
		 for(i=0;i<sizerow;i++) {
			 for(j=0;j<sizecol;j++) {
				arr[i][j]=sc.next(); 
			 }
		 }
		 System.out.println(" Printing the array  ");
		 for(i=0;i<sizerow;i++) {
			 for(j=0;j<sizecol;j++) {
				 System.out.print(arr[i][j]+ " ");
 }
			 System.out.println();
		 }
	 }
}
