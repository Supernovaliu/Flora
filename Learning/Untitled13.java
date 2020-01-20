class BitTest 
{
	public static void main(String[] args) 
	{
		int i = 21;
		i = -21;
		System.out.println("i<<2:"+(i<<2));
		
		int m = 12;
		int n = 5;
		System.out.println(m&n);
		System.out.println(m|n);
		System.out.println(m^n);

		int num1 = 10;
		int num2 = 20;

		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1="+num1+",num2="+num2);

         num1 = num1+num2;
		 num2 = num1-num2;
		 num1 = num1-num2;//弊端：相加操作可能超出存储范围。有局限性，只能适用于数值类型
		System.out.println("num1="+num1+",num2="+num2);

//m=k^n=(m^n)^n
         num1 = num1^num2;
		 num2 = num1^num2;
		 num1 = num1^num2;
		 System.out.println("num1="+num1+",num2="+num2);


		System.out.println("num1="+num1+",num2="+num2);





	}
}
