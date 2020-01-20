class AriTest 
{
	public static void main(String[] args) 
	{
		int num1 = 12;
		int num2 = 5;
		int result1 = num1/num2;
		System.out.println(result1);

		int result2 = num1/num2*num2;
		System.out.println(result2);

		double result3 = num1/num2;
		System.out.println(result3);

		double result4 = num1/(num2+0.0);
		double result5 = (double)num1/num2;
		System.out.println(result4);
		System.out.println(result5);


        int m1 = 12;
		int n1 = 5;
		System.out.println("m1 % n1 ="+m1%n1);

        
		 int a1 = 10;
		 int b1 = ++a1;
		 System.out.println("a1 ="+a1+",b1="+b1);

		 int a2 = 10;
		 int b2 = a2++;
		 System.out.println("a2="+a2+",b2="+b2);

		 byte bb1 =127;
		 bb1++;
		 System.out.println("bb1 ="+bb1);




	}
}
