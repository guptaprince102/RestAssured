package JavaLearnings;

public class pattern5 {

	public static void main(String[] args) {
	/*	7 6 5 4 3 2 1
		7 6 5 4 3 2 
		7 6 5 4 3 
		7 6 5 4
		7 6 5
		7 6
		7
	*/
		for(int i=1; i<=7;i++){
			for(int j=7;j>=i;j--){
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}

}
