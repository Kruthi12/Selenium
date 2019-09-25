package Day1;
import java.util.Scanner;
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of subjects:");
		int n=sc.nextInt();
		int marks[]=new int[n];
		int sum=0;
		float avg;
		System.out.println("Enter the marks:");
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
			sum=sum+marks[i];
		}
		avg=(float)sum/n;
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+avg);
		sc.close();
	}
}