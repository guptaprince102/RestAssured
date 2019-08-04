package JavaLearnings;

public class DemoIfElse {

	public static void main(String[] args) {
		int a , b , c;
		a = 15;
		b = 12;
		c = 9;
		if (a>b && a>c)
			System.out.println(a + " is the greatest number");
		else if (b>c)
			System.out.println(b + " is the greatest number");
		else
			System.out.println(c + " is the greatest number");
	}

}
