package JavaLearnings;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
/*		1111111
		1111122
		1111333
		1114444
		1155555
		1666666
		7777777
*/	
		Scanner sc = new Scanner(System.in);
        
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
		for(int i=1;i<=rows;i++){
			for(int j=1; j<=rows;j++){
				if((i+j)>=rows+1)
					System.out.print(i+" ");
				else
					System.out.print("1 ");
			}
			System.out.println();
		}
	}

}
