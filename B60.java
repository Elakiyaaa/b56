package GUVI;
import java.util.Scanner;
public class B60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int i;
		int min=1;
		int max=a[0];
		for( i=0;i<a.length;i++){
			a[i]=s.nextInt();
		}
		for( i=0;i<a.length;i++){
			if(a[i]>=max){
			max=a[i];
			}
			if(a[i]<=min){
					min=a[i];
						}
}
		
		System.out.println(min);
		System.out.println(max);
		System.out.println("SUM is "+(min+max));
}
	/*	for( i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				
			}
		}*/
		

	}


