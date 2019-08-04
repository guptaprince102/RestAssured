package JavaLearnings;

import java.util.Scanner;

public class pattern15 {

	public static void main(String[] args) {
/*		1
		2 6
		3 7 10 
		4 8 11 13
		5 9 12 14 15
*/
		Scanner sc = new Scanner(System.in);
		System.out.println("PLease enter rows");
		int rows = sc.nextInt();
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				if(j==1)
					System.out.print(i+" ");
				else
					System.out.print(i+2*j+" ");
			}
			System.out.println();
		}
	}

}
