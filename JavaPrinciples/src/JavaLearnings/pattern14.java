package JavaLearnings;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
/*		1010101
		0101010
		1010101
		0101010
		1010101
		0101010
		1010101
*/
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for(int i=1;i<=rows;i++){
			for(int j=1; j<=7;j++){
				if((i+j)%2==0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}

}
