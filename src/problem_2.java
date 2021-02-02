
public class problem_2 {

	public static void main(String[] args) {
		
		int limit=Integer.parseInt(args[0]);
		int a=2;
		int b=8;
		int c;
		int sum=a+b;
		
		c=a+4*b;
		
		while (c<limit)
		{
			sum+=c;
			a=b;
			b=c;
			c=a+4*b;
		};
		
		
		System.out.printf("Sum of odd number less than "+ limit+ " is " + sum);
	}

}
