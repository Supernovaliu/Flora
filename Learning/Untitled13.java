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
		 num1 = num1-num2;//�׶ˣ���Ӳ������ܳ����洢��Χ���о����ԣ�ֻ����������ֵ����
		System.out.println("num1="+num1+",num2="+num2);

//m=k^n=(m^n)^n
         num1 = num1^num2;
		 num2 = num1^num2;
		 num1 = num1^num2;
		 System.out.println("num1="+num1+",num2="+num2);


		System.out.println("num1="+num1+",num2="+num2);





	}
}
